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

# Function to fetch data of a specific user by ID
def fetch_user_data(user_id):
    conn = connect_to_database()
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM users WHERE id = %s", (user_id,))
    user_data = cursor.fetchone()  # Assuming only one user will be fetched
    conn.close()
    return user_data

# Parsing URL parameters
form = cgi.FieldStorage()
user_id = form.getvalue('id')

# Fetch user data
if user_id:
    user_data = fetch_user_data(user_id)
    if user_data:
        # Render HTML form with pre-filled data for editing
        print(f"""
            <!DOCTYPE html>
            <html>
            <head>
                <title>Edit Data</title>
                <style>
                    body {{
                        font-family: Arial, sans-serif;
                        background-color: #f0f0f0;
                        text-align: center;
                    }}
                    form {{
                        width: 50%;
                        margin: 20px auto;
                        padding: 20px;
                        background-color: #fff;
                        border: 1px solid #ddd;
                    }}
                    label, input {{
                        display: block;
                        margin-bottom: 10px;
                    }}
                    input[type='submit'] {{
                        padding: 10px 20px;
                        background-color: #007bff;
                        border: none;
                        color: #fff;
                        cursor: pointer;
                    }}
                    input[type='submit']:hover {{
                        background-color: #0056b3;
                    }}
                </style>
            </head>
            <body>
                <h1>Edit User Data</h1>
                <form method="post" action="update_data.py">
                    <input type="hidden" name="id" value="{user_data[0]}">
                    <label for="name">Name:</label>
                    <input type="text" id="name" name="name" value="{user_data[1]}">

                    <label for="happy">Happy:</label>
                    <input type="checkbox" id="happy" name="happy" {'checked' if user_data[2] else ''}>

                    <label for="sad">Sad:</label>
                    <input type="checkbox" id="sad" name="sad" {'checked' if user_data[3] else ''}>

                    <input type="submit" value="Update">
                </form>
            </body>
            </html>
        """)
    else:
        print("<p>User not found.</p>")
else:
    print("<p>No user ID provided.</p>")
