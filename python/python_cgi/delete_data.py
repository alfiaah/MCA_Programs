#!C:\Users\cclab57\AppData\Local\Programs\Python\Python312\python.exe

import cgi
import mysql.connector

print("Content-type: text/html\n")

# Function to establish connection to MySQL
def connect_to_database():
    return mysql.connector.connect(
        host="localhost",
        user="root",  # Replace with your MySQL username
        password="",  # Replace with your MySQL password
        database="python_cgi"  # Replace with your MySQL database name
    )

# Function to delete user data by ID
def delete_user_data(user_id):
    conn = connect_to_database()
    cursor = conn.cursor()
    cursor.execute("DELETE FROM users WHERE id = %s", (user_id,))
    conn.commit()
    conn.close()

# Parsing URL parameters
form = cgi.FieldStorage()
user_id = form.getvalue('id')

# Delete user data if ID is provided
if user_id:
    delete_user_data(user_id)
    print("<p>User data deleted successfully.</p>")
else:
    print("<p>No user ID provided.</p>")
