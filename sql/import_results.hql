USE team1_projectdb;

DROP TABLE IF EXISTS model_evaluation;
DROP TABLE IF EXISTS model1_latitude_pred;
DROP TABLE IF EXISTS model1_longitude_pred;
DROP TABLE IF EXISTS model2_latitude_pred;
DROP TABLE IF EXISTS model2_longitude_pred;

CREATE TABLE IF NOT EXISTS model_evaluation(
    model string COMMENT 'Model',
    lat string COMMENT 'Lat',
    lon string COMMENT 'Lon',
    rmse float COMMENT 'RMSE',
    r2 float COMMENT 'R2'
)
    ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde'
    WITH SERDEPROPERTIES (
       "separatorChar" = ",",
       "quoteChar"     = "\""
    )
    stored as textfile
    location 'project/hive/warehouse/evaluation';

CREATE TABLE IF NOT EXISTS model1_latitude_pred(
    prediction float COMMENT 'Model prediction',
    latitude float COMMENT 'GT latitude'
)
    ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde'
    WITH SERDEPROPERTIES (
       "separatorChar" = ",",
       "quoteChar"     = "\""
    )
    stored as textfile
    location 'project/hive/warehouse/model1_latitude_pred';
    
CREATE TABLE IF NOT EXISTS model1_longitude_pred(
    prediction float COMMENT 'Model prediction',
    longitude float COMMENT 'GT longitude'
)
    ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde'
    WITH SERDEPROPERTIES (
       "separatorChar" = ",",
       "quoteChar"     = "\""
    )
    stored as textfile
    location 'project/hive/warehouse/model1_longitude_pred';
   
CREATE TABLE IF NOT EXISTS model2_latitude_pred(
    prediction float COMMENT 'Model prediction',
    latitude float COMMENT 'GT latitude'
)
    ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde'
    WITH SERDEPROPERTIES (
       "separatorChar" = ",",
       "quoteChar"     = "\""
    )
    stored as textfile
    location 'project/hive/warehouse/model2_latitude_pred';
    
CREATE TABLE IF NOT EXISTS model2_longitude_pred(
    prediction float COMMENT 'Model prediction',
    longitude float COMMENT 'GT longitude'
)
    ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde'
    WITH SERDEPROPERTIES (
       "separatorChar" = ",",
       "quoteChar"     = "\""
    )
    stored as textfile
    location 'project/hive/warehouse/model2_longitude_pred';

LOAD DATA INPATH '/user/team1/project/results/evaluation.csv' INTO TABLE model_evaluation;
LOAD DATA INPATH '/user/team1/project/results/model1_latitude_predictions.csv' INTO TABLE model1_latitude_pred;
LOAD DATA INPATH '/user/team1/project/results/model1_longitude_predictions.csv' INTO TABLE model1_longitude_pred;
LOAD DATA INPATH '/user/team1/project/results/model2_latitude_predictions.csv' INTO TABLE model2_latitude_pred;
LOAD DATA INPATH '/user/team1/project/results/model2_longitude_predictions.csv' INTO TABLE model2_longitude_pred;

select * from model_evaluation;

select * from model1_latitude_pred limit 5;
select * from model1_longitude_pred limit 5;
select * from model2_latitude_pred limit 5;
select * from model2_longitude_pred limit 5;