USE team1_projectdb;
DROP TABLE IF EXISTS model_evaluation;

CREATE TABLE IF NOT EXISTS model_evaluation(
    model string,
    lat string,
    lon string,
    rmse float,
    r2 float
)
    row format delimited
    fields terminated by ','
    stored as textfile
    location 'project/results/evaluation';

LOAD DATA LOCAL INPATH 'project/results/evaluation/evaluation.csv' INTO TABLE model_evaluation;
select * from model_evaluation;