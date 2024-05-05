#!/bin/bash
hdfs dfs -rm -r project/results
hdfs dfs -mkdir project/results/evaluation
hdfs dfs -put /home/team1/project/bigdata-final-project-iu-2024/output/evaluation.csv project/results/evaluation

# Get password
password=$(head -n 1 secrets/.hive.pass)

# Build hive db
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p $password -f sql/import_results.hql