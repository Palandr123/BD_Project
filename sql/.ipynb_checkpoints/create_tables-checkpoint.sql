-- Optional
-- but it is useful if you want to not commit the change when some errors happened before the commit statement
START TRANSACTION;

DROP TABLE IF EXISTS police_dept_incident_reports;
DROP type IF EXISTS day_of_week;

CREATE type day_of_week AS ENUM (
    'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday',  'Sunday'
);

-- Add tables
CREATE TABLE IF NOT EXISTS police_dept_incident_reports (
    incident_datetime date NOT NULL,
    incident_date date NOT NULL,
    incident_time char(5) NOT NULL,
    incident_year integer NOT NULL,
    incident_dow day_of_week NOT NULL,
    report_datetime date NOT NULL,
    row_id bigint PRIMARY KEY,
    incident_id integer NOT NULL,
    incident_number integer NOT NULL,
    cad_number integer,
    report_type_code char(2) NOT NULL,
    report_type_description VARCHAR(19) NOT NULL,
    filled_online BOOLEAN,
    incident_code integer NOT NULL,
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
);

SELECT version();

COMMIT;