DROP DATABASE IF EXISTS team1_projectdb CASCADE;

CREATE DATABASE team1_projectdb LOCATION "project/hive/warehouse";
USE team1_projectdb;


CREATE EXTERNAL TABLE police_dept_incident_reports STORED AS AVRO LOCATION 'project/warehouse/police_dept_incident_reports' TBLPROPERTIES ('avro.schema.url'='project/warehouse/avsc/police_dept_incident_reports.avsc');

SELECT * FROM police_dept_incident_reports LIMIT 10;


SET hive.exec.dynamic.partition = true;
SET hive.exec.dynamic.partition.mode = nonstrict;
SET hive.enforce.bucketing=true;


CREATE TABLE IF NOT EXISTS police_dept_incident_reports_part_buck (
    incident_datetime date,
    incident_date date,
    incident_time char(5),
    incident_dow VARCHAR(10),
    report_datetime date,
    row_id bigint,
    incident_id integer,
    incident_number integer,
    cad_number integer,
    report_type_code char(2),
    report_type_description VARCHAR(19),
    filled_online BOOLEAN,
    incident_code integer,
    incident_category VARCHAR(50),
    incident_subcategory VARCHAR(40),
    incident_descr VARCHAR(90),
    resolution VARCHAR(20),
    intersection VARCHAR(90),
    cnn integer,
    police_district VARCHAR(10),
    analysis_neigh VARCHAR(30),
    supervisor_distr integer,
    supervisor_distr_2012 integer,
    latitude float,
    longitude float,
    datapoint VARCHAR(46),
    neighbourhoods integer,
    -- ESNCAG - Boundary File
    esncag integer,
    -- Central Market/Tenderloin Boundary Polygon - Updated
    cm_polygon integer,
    -- Civic Center Harm Reduction Project Boundary
    cchr integer,
    -- HSOC Zones as of 2018-06-05
    hsoc integer,
    -- Invest In Neighborhoods (IIN) Areas
    iin integer,
    -- Current Supervisor Districts
    csd integer,
    -- Current Police Districts
    cpd integer
)
    PARTITIONED BY (incident_year integer) 
    CLUSTERED BY (row_id) into 7 buckets
    STORED AS AVRO LOCATION 'project/hive/warehouse/police_dept_incident_reports' 
    TBLPROPERTIES ('AVRO.COMPRESS'='SNAPPY')
;

INSERT INTO police_dept_incident_reports_part_buck
SELECT 
    from_unixtime(FLOOR(CAST(incident_datetime AS BIGINT)/1000), 'yyyy-MM-dd HH:mm:ss.SSS') AS incident_datetime,
    from_unixtime(FLOOR(CAST(incident_date AS BIGINT)/1000), 'yyyy-MM-dd HH:mm:ss.SSS') AS incident_date,
    incident_time,
    incident_dow,
    from_unixtime(FLOOR(CAST(report_datetime AS BIGINT)/1000), 'yyyy-MM-dd HH:mm:ss.SSS') AS report_datetime,
    row_id,
    incident_id,
    incident_number,
    cad_number,
    report_type_code,
    report_type_description,
    filled_online,
    incident_code,
    incident_category,
    incident_subcategory,
    incident_descr,
    resolution,
    intersection,
    cnn,
    police_district,
    analysis_neigh,
    supervisor_distr,
    supervisor_distr_2012,
    latitude,
    longitude,
    datapoint,
    neighbourhoods,
    esncag,
    cm_polygon,
    cchr,
    hsoc,
    iin,
    csd,
    cpd,
    incident_year
FROM police_dept_incident_reports;

DROP TABLE IF EXISTS police_dept_incident_reports;