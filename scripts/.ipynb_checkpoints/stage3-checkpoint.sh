#!/bin/bash
# Submit stage
spark-submit --master yarn ./models/model.py

# Copy results to local
# Linear regression
rm -rf output/model1_longitude_predictions.csv
hdfs dfs -cat project/output/model1_longitude_predictions.csv/*.csv > output/model1_longitude_predictions.csv

rm -rf output/model1_latitude_predictions.csv
hdfs dfs -cat project/output/model1_latitude_predictions.csv/*.csv > output/model1_latitude_predictions.csv

# Decision tree regression
rm -rf output/model2_longitude_predictions.csv
hdfs dfs -cat project/output/model2_longitude_predictions.csv/*.csv > output/model2_longitude_predictions.csv

rm -rf output/model2_latitude_predictions.csv
hdfs dfs -cat project/output/model2_latitude_predictions.csv/*.csv > output/model2_latitude_predictions.csv

# Model evaluation
rm -rf output/evaluation.csv
hdfs dfs -cat project/output/evaluation.csv/*.csv > output/evaluation.csv

# Save models
rm -rf models/model1_longitude
hdfs dfs -copyToLocal project/models/model1_longitude models/model1_longitude

rm -rf models/model1_latitude
hdfs dfs -copyToLocal project/models/model1_latitude models/model1_latitude

rm -rf models/model2_longitude
hdfs dfs -copyToLocal project/models/model2_longitude models/model2_longitude

rm -rf models/model2_latitude
hdfs dfs -copyToLocal project/models/model2_latitude models/model2_latitude