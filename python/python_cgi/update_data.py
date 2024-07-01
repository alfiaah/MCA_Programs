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

# Function to update user data by ID
def update_user_data(user_id, name, happy, sad):
    conn = connect_to_database()
    cursor = conn.cursor()
    cursor.execute("UPDATE users SET name = %s, happy = %s, sad = %s WHERE id = %s", (name, happy, sad, user_id))
    conn.commit()
    conn.close()

# Parsing form data
form = cgi.FieldStorage()
user_id = form.getvalue('id')
name = form.getvalue('name')
happy = 1 if form.getvalue('happy') else 0
sad = 1 if form.getvalue('sad') else 0

# Update user data if ID is provided
if user_id and name is not None:
    update_user_data(user_id, name, happy, sad)
    print("<h1>Data Updated Successfully</h1>")
    print(f"<p>Name: {name}</p>")
    print(f"<p>Happy: {'Yes' if happy else 'No'}</p>")
    print(f"<p>Sad: {'Yes' if sad else 'No'}</p>")
else:
    print("<h1>Error: User ID or Name Missing</h1>")
