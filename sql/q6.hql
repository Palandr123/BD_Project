SET hive.resultset.use.unique.column.names = false;

USE team1_projectdb;

DROP TABLE IF EXISTS q6_results;

-- Find mean response time (minute) by police districts

CREATE EXTERNAL TABLE q6_results
(
    incident_dow varchar(10),
    mean_response_time float
)
    ROW FORMAT DELIMITED
    FIELDS TERMINATED BY ','
    location 'project/hive/warehouse/q6'; 


INSERT INTO q6_results
SELECT incident_dow, AVG((unix_timestamp(report_datetime, 'yyyy/MM/dd HH:mm:ss a') - unix_timestamp(incident_datetime, 'yyyy/MM/dd HH:mm:ss a')) / 60) as mean_response_time
FROM police_dept_incident_reports_part_buck AS incidents
WHERE incident_dow IS NOT NULL AND incident_datetime IS NOT NULL AND report_datetime IS NOT NULL
GROUP BY incident_dow;

INSERT OVERWRITE DIRECTORY 'project/output/q6' 
ROW FORMAT DELIMITED FIELDS 
TERMINATED BY ',' 
SELECT * FROM q6_results;
