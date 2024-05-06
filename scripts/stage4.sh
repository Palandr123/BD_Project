#!/bin/bash
sed '1d' output/evaluation.csv > output/eval_temp
sed '1d' output/model1_latitude_predictions.csv > output/m1_lat_pred
sed '1d' output/model1_longitude_predictions.csv > output/m1_lon_pred
sed '1d' output/model2_latitude_predictions.csv > output/m2_lat_pred
sed '1d' output/model2_longitude_predictions.csv > output/m2_lon_pred

hdfs dfs -rm -r project/results
hdfs dfs -mkdir project/results

hdfs dfs -put /home/team1/project/bigdata-final-project-iu-2024/output/eval_temp project/results
hdfs dfs -mv project/results/eval_temp project/results/evaluation.csv

hdfs dfs -put /home/team1/project/bigdata-final-project-iu-2024/output/m1_lat_pred project/results
hdfs dfs -mv project/results/m1_lat_pred project/results/model1_latitude_predictions.csv

hdfs dfs -put /home/team1/project/bigdata-final-project-iu-2024/output/m1_lon_pred project/results
hdfs dfs -mv project/results/m1_lon_pred project/results/model1_longitude_predictions.csv

hdfs dfs -put /home/team1/project/bigdata-final-project-iu-2024/output/m2_lat_pred project/results
hdfs dfs -mv project/results/m2_lat_pred project/results/model2_latitude_predictions.csv

hdfs dfs -put /home/team1/project/bigdata-final-project-iu-2024/output/m2_lon_pred project/results
hdfs dfs -mv project/results/m2_lon_pred project/results/model2_longitude_predictions.csv

rm output/eval_temp
rm output/m1_lat_pred
rm output/m1_lon_pred
rm output/m2_lat_pred
rm output/m2_lon_pred

# Get password
password=$(head -n 1 secrets/.hive.pass)

# Build hive db
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p $password -f sql/import_results.hql