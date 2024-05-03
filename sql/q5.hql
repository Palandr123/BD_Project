SET hive.resultset.use.unique.column.names = false;

USE team1_projectdb;

DROP TABLE IF EXISTS q5_results;

-- Count incidents by day of week

CREATE EXTERNAL TABLE q5_results
(
    day_of_week STRING,
    incident_count_average INT
)
    ROW FORMAT DELIMITED
    FIELDS TERMINATED BY ','
    location 'project/hive/warehouse/q5'; 


INSERT INTO q5_results
SELECT incident_dow, AVG(incident_count) as incident_count_average
FROM (
    SELECT incident_dow, incident_date, COUNT(*) as incident_count
    FROM police_dept_incident_reports_part_buck
    WHERE incident_date IS NOT NULL
    GROUP BY incident_dow, incident_date
) incident_table
GROUP BY incident_dow;

INSERT OVERWRITE DIRECTORY 'project/output/q5' 
ROW FORMAT DELIMITED FIELDS 
TERMINATED BY ',' 
SELECT * FROM q5_results;
