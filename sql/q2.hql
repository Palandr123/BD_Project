SET hive.resultset.use.unique.column.names = false;

USE team1_projectdb;

DROP TABLE IF EXISTS q2_results;

-- Count incidents by incident_category

CREATE EXTERNAL TABLE q2_results
(
    incident_category STRING,
    incident_count INT
)
    ROW FORMAT DELIMITED
    FIELDS TERMINATED BY ','
    location 'project/hive/warehouse/q2'; 


INSERT INTO q2_results
SELECT incident_category,
COUNT(*) AS incident_count
FROM police_dept_incident_reports_part_buck AS incidents
WHERE incident_category IS NOT NULL
GROUP BY incident_category
ORDER BY incident_count DESC;

INSERT OVERWRITE DIRECTORY 'project/output/q2' 
ROW FORMAT DELIMITED FIELDS 
TERMINATED BY ',' 
SELECT * FROM q2_results;
