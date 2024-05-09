SET hive.resultset.use.unique.column.names = false;

USE team1_projectdb;

DROP TABLE IF EXISTS q8_results;

-- Count incidents by hour

CREATE EXTERNAL TABLE q8_results
(
    latitude float,
    longitude float
)
    ROW FORMAT DELIMITED
    FIELDS TERMINATED BY ','
    location 'project/hive/warehouse/q8'; 


INSERT INTO q8_results
SELECT latitude, longitude
FROM police_dept_incident_reports_part_buck;

INSERT OVERWRITE DIRECTORY 'project/output/q8' 
ROW FORMAT DELIMITED FIELDS 
TERMINATED BY ',' 
SELECT * FROM q8_results;
