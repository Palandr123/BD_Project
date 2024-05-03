"""
Connects to a PostgreSQL database using psycopg2 and executes SQL commands from files.

This script reads a password from a secrets file, builds a connection string, connects
to a remote database, executes SQL commands to create tables and import data, and
executes additional SQL commands from a test file.

Attributes:
    CONN_STRING (str): Connection string with host, port, user, dbname, and password.
    password (str): Password for accessing the database, read from a secrets file.

Dependencies:
    - os: Provides a portable way of using operating system-dependent functionality.
    - pprint: Provides a capability to pretty-print Python data structures.
    - psycopg2 (psycopg2): PostgreSQL adapter for Python.

Example:
    Running this script establishes a connection to a remote PostgreSQL database,
    creates tables, imports data, and executes test SQL commands.
"""
import os
from pprint import pprint

import psycopg2 as psql


# Read password from secrets file
file = os.path.join("secrets", ".psql.pass")
with open(file, "r", encoding="utf-8") as file:
    password = file.read().rstrip()


# build connection string
CONN_STRING = (
    "host=hadoop-04.uni.innopolis.ru "
    "port=5432 "
    "user=team1 "
    "dbname=team1_projectdb "
    f"password={password}"
)


# Connect to the remote dbms
with psql.connect(CONN_STRING) as conn:
    # Create a cursor for executing psql commands
    cur = conn.cursor()
    # Read the commands from the file and execute them.
    with open(os.path.join("sql", "create_tables.sql"), encoding="utf-8") as file:
        content = file.read()
        cur.execute(content)
    conn.commit()

    # Read the commands from the file and execute them.
    with open(os.path.join("sql", "import_data.sql"), encoding="utf-8") as file:
        # We assume that the COPY commands in the file are ordered (1.depts, 2.emps)
        commands = file.readlines()
        with open(
            os.path.join("data", "Police_Department_Incident_Reports_100k.csv"),
            "r",
            encoding="utf-8",
        ) as data:
            cur.copy_expert(commands[1], data)

    # If the sql statements are CRUD then you need to commit the change
    conn.commit()

    pprint(conn)
    cur = conn.cursor()
    # Read the sql commands from the file
    with open(os.path.join("sql", "test_database.sql"), encoding="utf-8") as file:
        commands = file.readlines()
        for command in commands:
            if not command.startswith("--"):
                cur.execute(command)
                # Read all records and print them
                pprint(cur.fetchall())
