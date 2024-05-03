-- always test if you can import the data from PgAdmin then you automate it by writing the script
COPY police_dept_incident_reports FROM STDIN WITH (FORMAT CSV, HEADER, DELIMITER ',', NULL '');