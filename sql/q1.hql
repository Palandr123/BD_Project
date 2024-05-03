SET hive.resultset.use.unique.column.names = false;

USE team1_projectdb;

DROP TABLE IF EXISTS q1_results;

-- Count incidents by incident_year

CREATE EXTERNAL TABLE q1_results
(
    incident_year INT,
    incident_count INT
)
    ROW FORMAT DELIMITED
    FIELDS TERMINATED BY ','
    location 'project/hive/warehouse/q1'; 


INSERT INTO q1_results
SELECT incident_year,
COUNT(*) AS incident_count
FROM police_dept_incident_reports_part_buck AS incidents
WHERE incident_year IS NOT NULL
GROUP BY incident_year
ORDER BY incident_count DESC;

INSERT OVERWRITE DIRECTORY 'project/output/q1' 
ROW FORMAT DELIMITED FIELDS 
TERMINATED BY ',' 
SELECT * FROM q1_results;