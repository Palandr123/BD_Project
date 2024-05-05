SET hive.resultset.use.unique.column.names = false;

USE team1_projectdb;

DROP TABLE IF EXISTS q1_results;

-- Find mean response time (minute) by police districts

CREATE EXTERNAL TABLE q1_results
(
    police_district varchar(10),
    mean_response_time float
)
    ROW FORMAT DELIMITED
    FIELDS TERMINATED BY ','
    location 'project/hive/warehouse/q1'; 


INSERT INTO q1_results
SELECT police_district, AVG((unix_timestamp(report_datetime, 'yyyy/MM/dd HH:mm:ss a') - unix_timestamp(incident_datetime, 'yyyy/MM/dd HH:mm:ss a')) / 60) as mean_response_time
FROM police_dept_incident_reports_part_buck AS incidents
WHERE police_district IS NOT NULL AND incident_datetime IS NOT NULL AND report_datetime IS NOT NULL
GROUP BY police_district;

INSERT OVERWRITE DIRECTORY 'project/output/q1' 
ROW FORMAT DELIMITED FIELDS 
TERMINATED BY ',' 
SELECT * FROM q1_results;
