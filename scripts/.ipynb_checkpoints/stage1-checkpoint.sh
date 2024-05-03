#!/bin/bash
rm -f data/Police_Department_Incident_Reports_100k.csv

url="https://docs.google.com/uc?export=download&id=1o9w51Mo0BW1UGlHpadqdkifXGDWY4Dce"

wget --no-check-certificate $url -O data/Police_Department_Incident_Reports_100k.csv

python3 scripts/build_projectdb.py

password=$(head -n 1 secrets/.psql.pass)

hdfs dfs -rm -r -f project/warehouse

sqoop import-all-tables \
    --connect jdbc:postgresql://hadoop-04.uni.innopolis.ru/team1_projectdb \
    --username team1 \
    --password $password \
    --compression-codec=snappy \
    --compress \
    --as-avrodatafile \
    --warehouse-dir=project/warehouse --m 1

rm -rf output/warehouse
hdfs dfs -copyToLocal project/warehouse/* output/warehouse
mv ./police_dept_incident_reports.avsc output
mv ./police_dept_incident_reports.java output