#!C:\Users\cclab57\AppData\Local\Programs\Python\Python312\python.exe

import cgi
import json
import mysql.connector

print("Content-type: application/json\n")

# Function to establish connection to MySQL
def connect_to_database():
    return mysql.connector.connect(
        host="localhost",
        user="root",  # Replace with your MySQL username
        password="",  # Replace with your MySQL password
        database="python_cgi"  # Replace with your MySQL database name
    )

# Function to fetch all data from MySQL
def fetch_all_data():
    conn = connect_to_database()
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users")
    rows = cursor.fetchall()
    conn.close()
    return rows

# Fetch data and print as JSON
data = fetch_all_data()
print(json.dumps(data))
