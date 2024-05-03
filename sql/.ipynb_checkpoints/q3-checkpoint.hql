SET hive.resultset.use.unique.column.names = false;

USE team1_projectdb;

DROP TABLE IF EXISTS q3_results;

-- Count incidents by neighbourhood

CREATE EXTERNAL TABLE q3_results
(
    analysis_neigh STRING,
    incident_count INT
)
    ROW FORMAT DELIMITED
    FIELDS TERMINATED BY ','
    location 'project/hive/warehouse/q3'; 


INSERT INTO q3_results
SELECT analysis_neigh,
COUNT(*) AS incident_count
FROM police_dept_incident_reports_part_buck AS incidents
WHERE analysis_neigh IS NOT NULL
GROUP BY analysis_neigh
ORDER BY incident_count DESC;

INSERT OVERWRITE DIRECTORY 'project/output/q3' 
ROW FORMAT DELIMITED FIELDS 
TERMINATED BY ',' 
SELECT * FROM q3_results;
