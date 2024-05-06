"""
Stage 3 model implementation and evaluation
"""
import math
import numpy as np
import pyspark.sql.functions as F
import pyspark.sql.types as T
from pyspark.sql import SparkSession
from pyspark.ml import Pipeline
from pyspark.ml.feature import StringIndexer, VectorAssembler
from pyspark.ml.regression import LinearRegression, GBTRegressor
from pyspark.ml.evaluation import RegressionEvaluator
from pyspark.ml.tuning import CrossValidator, ParamGridBuilder


dow_list = ['Monday', 'Tuesday', 'Wednesday',
            'Thursday', 'Friday', 'Saturday', 'Sunday']
DOW_MAP = dict(zip(dow_list, range(7)))


def year_encode(val):
    """Encode year str to float"""
    val = str(val)
    return float(val[:4])


def month_sin(val):
    """Encode month to sin component"""
    val = str(val)
    val = int(val[5:7])
    return math.sin(2 * np.pi * val / 12)


def month_cos(val):
    """Encode month to cos component"""
    val = str(val)
    val = int(val[5:7])
    return math.cos(2 * np.pi * val / 12)


def date_sin(val):
    """Encode date to sin component"""
    val = str(val)
    val = int(val[8:10])
    return math.sin(2 * np.pi * val / 31)


def date_cos(val):
    """Encode date to cos component"""
    val = str(val)
    val = int(val[8:10])
    return math.cos(2 * np.pi * val / 31)


def hour_sin(val):
    """Encode hour to sin component"""
    val = int(val[:2])
    return math.sin(2 * np.pi * val / 24)


def hour_cos(val):
    """Encode hour to cos component"""
    val = int(val[:2])
    return math.cos(2 * np.pi * val / 24)


def minute_sin(val):
    """Encode min to sin component"""
    val = int(val[-2:])
    return math.sin(2 * np.pi * val / 60)


def minute_cos(val):
    """Encode min to cos component"""
    val = int(val[-2:])
    return math.cos(2 * np.pi * val / 60)


def dow_sin(val):
    """Encode day of week to sin component"""
    return math.sin(2 * np.pi * DOW_MAP[val] / 7)


def dow_cos(val):
    """Encode day of week to cos component"""
    return math.cos(2 * np.pi * DOW_MAP[val] / 7)


# Add here your team number teamx
TEAM = "team1"

# location of your Hive database in HDFS
WAREHOUSE = "project/hive/warehouse"

spark = SparkSession.builder\
        .appName(f"{TEAM} - spark ML")\
        .master("yarn")\
        .config("hive.metastore.uris", "thrift://hadoop-02.uni.innopolis.ru:9883")\
        .config("spark.sql.warehouse.dir", WAREHOUSE)\
        .config("spark.sql.avro.compression.codec", "snappy")\
        .enableHiveSupport()\
        .getOrCreate()

sc = spark.sparkContext

print(spark.catalog.listDatabases())
spark.sql("SHOW DATABASES;").show()

incident_reports = spark.read.format("avro").\
    table('TEAM1_projectdb.police_dept_incident_reports_part_buck')

# https://docs.google.com/spreadsheets/d/1Sz_L9LEuZqLSNdyOUZKidgQ-RDqMb8TwA0jZ8sGbElM/edit#gid=0
use_features = ["incident_date", "incident_time", "incident_dow",
                "report_datetime", "report_type_code", "incident_code",
                "cnn", "neighbourhoods", "csd", "cpd"]
target = ['longitude', 'latitude']
incident_reports = incident_reports[use_features + target]

udf_year = F.udf(year_encode, T.FloatType())
udf_month_sin = F.udf(month_sin, T.FloatType())
udf_month_cos = F.udf(month_cos, T.FloatType())
udf_date_sin = F.udf(date_sin, T.FloatType())
udf_date_cos = F.udf(date_cos, T.FloatType())
udf_hour_sin = F.udf(hour_sin, T.FloatType())
udf_hour_cos = F.udf(hour_cos, T.FloatType())
udf_min_sin = F.udf(minute_sin, T.FloatType())
udf_min_cos = F.udf(minute_cos, T.FloatType())
udf_dow_sin = F.udf(dow_sin, T.FloatType())
udf_dow_cos = F.udf(dow_cos, T.FloatType())


incident_reports = incident_reports.withColumn("incident_year", udf_year('incident_date'))
incident_reports = incident_reports.withColumn("incident_month_sin", udf_month_sin("incident_date"))
incident_reports = incident_reports.withColumn("incident_month_cos", udf_month_cos("incident_date"))
incident_reports = incident_reports.withColumn("incident_date_sin", udf_date_sin("incident_date"))
incident_reports = incident_reports.withColumn("incident_date_cos", udf_date_cos("incident_date"))
incident_reports = incident_reports.withColumn("incident_hour_sin", udf_hour_sin("incident_time"))
incident_reports = incident_reports.withColumn("incident_hour_cos", udf_hour_cos("incident_time"))
incident_reports = incident_reports.withColumn("incident_minute_sin", udf_min_sin("incident_time"))
incident_reports = incident_reports.withColumn("incident_minute_cos", udf_min_cos("incident_time"))
incident_reports = incident_reports.withColumn("incident_dow_sin", udf_dow_sin("incident_dow"))
incident_reports = incident_reports.withColumn("incident_dow_cos", udf_dow_cos("incident_dow"))

incident_reports = incident_reports.withColumn("report_year", udf_year('report_datetime'))
incident_reports = incident_reports.withColumn("report_month_sin", udf_month_sin("report_datetime"))
incident_reports = incident_reports.withColumn("report_month_cos", udf_month_cos("report_datetime"))
incident_reports = incident_reports.withColumn("report_date_sin", udf_date_sin("report_datetime"))
incident_reports = incident_reports.withColumn("report_date_cos", udf_date_cos("report_datetime"))

incident_reports = incident_reports.drop("incident_date", "incident_time",
                                         "incident_dow", "report_datetime")

categorical = ["report_type_code", "incident_code", "cnn",
               "neighbourhoods", "csd", "cpd"]

indexers = [StringIndexer(inputCol=c, outputCol=f"{c}_indexed").\
            setHandleInvalid("skip") for c in categorical]

pipeline = Pipeline(stages=indexers)

model = pipeline.fit(incident_reports)
incident_reports = model.transform(incident_reports)
incident_reports = incident_reports.drop(*categorical)

incident_reports = incident_reports.dropna()

incident_reports.show(10)

features = ["incident_year", "incident_month_sin", "incident_month_cos",
            "incident_date_sin", "incident_date_cos", "incident_hour_sin",
            "incident_hour_cos", "incident_minute_sin", "incident_minute_cos",
            "incident_dow_sin", "incident_dow_cos", "report_year",
            "report_month_sin", "report_month_cos", "report_date_sin",
            "report_date_cos", "report_type_code_indexed",
            "incident_code_indexed", "cnn_indexed",
            "neighbourhoods_indexed", "csd_indexed", "cpd_indexed"]

targets = ["longitude", "latitude"]

feature_assembler = VectorAssembler(inputCols=features, outputCol="features")
target_assembler = VectorAssembler(inputCols=targets, outputCol="targets")
transformed = feature_assembler.transform(incident_reports).\
    select("features", "longitude", "latitude")

RANDOM_STATE = 0
(trainingData, testData) = transformed.randomSplit([0.7, 0.3], RANDOM_STATE)

trainingData.select("features", "longitude", "latitude")\
    .coalesce(1)\
    .write\
    .mode("overwrite")\
    .format("json")\
    .save(f"/user/{TEAM}/project/data/train")

testData.select("features", "longitude", "latitude")\
    .coalesce(1)\
    .write\
    .mode("overwrite")\
    .format("json")\
    .save(f"/user/{TEAM}/project/data/test")

# There is no model for multiple targets
# so predict every lable with different model
# https://stackoverflow.com/a/45077411

# Make LinearRegression model
print("Training Linear Regression...")
lr_rmse = []
lr_r2 = []
best_models_1 = []
for predict_label in targets:
    lr = LinearRegression(featuresCol="features", labelCol=predict_label)

    evaluator_rmse = RegressionEvaluator(labelCol=predict_label,
                                         predictionCol="prediction",
                                         metricName="rmse")

    evaluator_r2 = RegressionEvaluator(labelCol=predict_label,
                                       predictionCol="prediction",
                                       metricName="r2")
    paramGrid = ParamGridBuilder().\
        addGrid(lr.elasticNetParam, [0.01, 0.1, 0.2]).\
        addGrid(lr.regParam, [0.01, 0.05, 0.1]).build()

    crossval = CrossValidator(estimator=lr,
                              estimatorParamMaps=paramGrid,
                              evaluator=evaluator_rmse,
                              numFolds=4,
                              seed=RANDOM_STATE)

    cvModel = crossval.fit(trainingData)
    bestModel1 = cvModel.bestModel
    BEST_EL_NET = str(bestModel1.getElasticNetParam())
    BEST_REG = str(bestModel1.getRegParam())
    best_models_1.append("LinearRegression, elasticNetParam="
                         f"{BEST_EL_NET},"
                         f" regParam={BEST_REG}")
    bestModel1.write().overwrite().save(f"/user/{TEAM}/project/models"
                                        "/model1_{predict_label}")
    predictions = bestModel1.transform(testData)

    predictions.coalesce(1)\
        .select("prediction", predict_label)\
        .write\
        .mode("overwrite")\
        .format("csv")\
        .option("sep", ",")\
        .option("header", "true")\
        .csv(f"/user/{TEAM}/project/output/model1_{predict_label}_predictions.csv")

    rmse = evaluator_rmse.evaluate(predictions)
    r2 = evaluator_r2.evaluate(predictions)
    lr_rmse.append(rmse)
    lr_r2.append(r2)

# Make GeneralizedLinearRegression regressor
print("Training GBT Regression...")
dr_rmse = []
dr_r2 = []
best_models_2 = []
for predict_label in targets:
    gbt = GBTRegressor(featuresCol="features",
                       labelCol=predict_label,
                       maxBins=10000,
                       seed=RANDOM_STATE)

    evaluator_rmse = RegressionEvaluator(labelCol=predict_label,
                                         predictionCol="prediction",
                                         metricName="rmse")

    evaluator_r2 = RegressionEvaluator(labelCol=predict_label,
                                       predictionCol="prediction",
                                       metricName="r2")

    paramGrid = ParamGridBuilder().\
        addGrid(gbt.maxDepth, [2, 3, 5]).\
        addGrid(gbt.lossType, ['squared', 'absolute']).build()

    crossval = CrossValidator(estimator=gbt,
                              estimatorParamMaps=paramGrid,
                              evaluator=evaluator_rmse,
                              numFolds=4,
                              seed=RANDOM_STATE)

    cvModel = crossval.fit(trainingData)
    bestModel2 = cvModel.bestModel
    BEST_MAX_DEPTH = str(bestModel2.getMaxDepth())
    BEST_LOSS_TYPE = str(bestModel2.getLossType())
    best_models_2.append("GBTRegressor,"
                         " maxDepth="
                         f"{BEST_MAX_DEPTH},"
                         f" lossType={BEST_LOSS_TYPE}")
    bestModel2.write().overwrite().\
        save(f"/user/{TEAM}/project/models/model2_{predict_label}")
    predictions = bestModel2.transform(testData)

    predictions.coalesce(1)\
        .select("prediction", predict_label)\
        .write\
        .mode("overwrite")\
        .format("csv")\
        .option("sep", ",")\
        .option("header", "true")\
        .csv(f"/user/{TEAM}/project/output/model2_{predict_label}_predictions.csv")

    rmse = evaluator_rmse.evaluate(predictions)
    r2 = evaluator_r2.evaluate(predictions)
    dr_rmse.append(rmse)
    dr_r2.append(r2)


models = [[best_models_1[0], "No", "Yes", lr_rmse[0], lr_r2[0]],
          [best_models_1[1], "Yes", "No", lr_rmse[1], lr_r2[1]],
          [best_models_2[0], "No", "Yes", dr_rmse[0], dr_r2[0]],
          [best_models_2[1], "Yes", "No", dr_rmse[1], dr_r2[1]]]

df = spark.createDataFrame(models, ["model", "Lat", "Lon", "RMSE", "R2"])

df.show(truncate=False)

df.coalesce(1)\
    .write\
    .mode("overwrite")\
    .format("csv")\
    .option("sep", ",")\
    .option("header", "true")\
    .save(f"/user/{TEAM}/project/output/evaluation.csv")

print("Done!")
