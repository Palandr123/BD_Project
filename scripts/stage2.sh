#!/bin/bash
hdfs dfs -rm -r project/warehouse/avsc
hdfs dfs -mkdir -p project/warehouse/avsc
hdfs dfs -put output/*.avsc project/warehouse/avsc

# Get password
password=$(head -n 1 secrets/.hive.pass)

# Build hive db
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p $password -f sql/db.hql > output/hive_results.txt

# Query 1
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p $password -f sql/q1.hql
rm ./output/q1.csv
echo "police_district,mean_response_time" > ./output/q1.csv
hdfs dfs -cat project/output/q1/* >> output/q1.csv

# Query 2
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p $password -f sql/q2.hql
rm ./output/q2.csv
echo "incident_category,incident_count" > ./output/q2.csv
hdfs dfs -cat project/output/q2/* >> output/q2.csv

# Query 3
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p $password -f sql/q3.hql
rm ./output/q3.csv
echo "analysis_neigh,incident_count" > ./output/q3.csv
hdfs dfs -cat project/output/q3/* >> output/q3.csv

# Query 4
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p $password -f sql/q4.hql
rm ./output/q4.csv
echo "hour,incident_count" > ./output/q4.csv
hdfs dfs -cat project/output/q4/* >> output/q4.csv

# Query 5
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p $password -f sql/q5.hql
rm ./output/q5.csv
echo "day_of_week,incident_count_average" > ./output/q5.csv
hdfs dfs -cat project/output/q5/* >> output/q5.csv

# Query 6
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p $password -f sql/q6.hql
rm ./output/q6.csv
echo "day_of_week,mean_response_time" > ./output/q6.csv
hdfs dfs -cat project/output/q6/* >> output/q6.csv

# Query 7
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p $password -f sql/q7.hql
rm ./output/q7.csv
echo "hour,mean_response_time" > ./output/q7.csv
hdfs dfs -cat project/output/q7/* >> output/q7.csv

# Query 8
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p $password -f sql/q8.hql
rm ./output/q8.csv
echo "latitude,longitude" > ./output/q8.csv
hdfs dfs -cat project/output/q8/* >> output/q8.csv
