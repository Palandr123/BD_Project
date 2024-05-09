SET hive.resultset.use.unique.column.names = false;

USE team1_projectdb;

DROP TABLE IF EXISTS q7_results;

-- Count incidents by hour

CREATE EXTERNAL TABLE q7_results
(
    hour STRING,
    mean_response_time float
)
    ROW FORMAT DELIMITED
    FIELDS TERMINATED BY ','
    location 'project/hive/warehouse/q7'; 


INSERT INTO q7_results
SELECT 
    SUBSTR(incident_time, 1, 2) as hour,
    AVG((unix_timestamp(report_datetime, 'yyyy/MM/dd HH:mm:ss a') - unix_timestamp(incident_datetime, 'yyyy/MM/dd HH:mm:ss a')) / 60) as mean_response_time
FROM police_dept_incident_reports_part_buck AS incidents
WHERE incident_time IS NOT NULL AND incident_datetime IS NOT NULL AND report_datetime IS NOT NULL
GROUP BY SUBSTR(incident_time, 1, 2);


INSERT OVERWRITE DIRECTORY 'project/output/q7' 
ROW FORMAT DELIMITED FIELDS 
TERMINATED BY ',' 
SELECT * FROM q7_results;
