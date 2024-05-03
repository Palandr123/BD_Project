SET hive.resultset.use.unique.column.names = false;

USE team1_projectdb;

DROP TABLE IF EXISTS q4_results;

-- Count incidents by hour

CREATE EXTERNAL TABLE q4_results
(
    hour STRING,
    incident_count INT
)
    ROW FORMAT DELIMITED
    FIELDS TERMINATED BY ','
    location 'project/hive/warehouse/q4'; 


INSERT INTO q4_results
SELECT SUBSTR(incident_time, 1, 2) as hour,
COUNT(*) AS incident_count
FROM police_dept_incident_reports_part_buck
WHERE incident_time IS NOT NULL
GROUP BY SUBSTR(incident_time, 1, 2)
ORDER BY SUBSTR(incident_time, 1, 2) ASC;

INSERT OVERWRITE DIRECTORY 'project/output/q4' 
ROW FORMAT DELIMITED FIELDS 
TERMINATED BY ',' 
SELECT * FROM q4_results;
