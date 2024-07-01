#!C:\Users\cclab57\AppData\Local\Programs\Python\Python312\python.exe
import cgi
import mysql.connector

# Function to establish connection to MySQL
def connect_to_database():
    return mysql.connector.connect(
        host="localhost",
        user="root",  # Replace with your MySQL username
        password="",  # Replace with your MySQL password
        database="python_cgi"  # Replace with your MySQL database name
    )

# Function to create a table in MySQL (if not exists)
def create_table():
    conn = connect_to_database()
    cursor = conn.cursor()
    cursor.execute('''CREATE TABLE IF NOT EXISTS users
                     (id INT AUTO_INCREMENT PRIMARY KEY,
                     name VARCHAR(255),
                     happy TINYINT(1),
                     sad TINYINT(1))''')
    conn.commit()
    conn.close()

# Function to insert data into MySQL
def insert_data(name, happy, sad):
    conn = connect_to_database()
    cursor = conn.cursor()
    cursor.execute("INSERT INTO users (name, happy, sad) VALUES (%s, %s, %s)", (name, happy, sad))
    conn.commit()
    conn.close()

# Send HTTP header indicating content type as HTML
print("Content-type: text/html\n\n")

# Start HTML document
print("<html><body style='text-align:center;'>")
print("<h1 style='color: green;'>CGI Website</h1>")

# Parse form data
form = cgi.FieldStorage()

# Check if 'name' field is present in form data
if form.getvalue("name"):
    name = form.getvalue("name")
    print("<h2>Hello, " + name + "!</h2>")
    print("<p>Thank you for using my website.</p>")
else:
    name = ""

# Check if 'happy' checkbox is selected
happy = 1 if form.getvalue("happy") else 0

# Check if 'sad' checkbox is selected
sad = 1 if form.getvalue("sad") else 0

# Insert data into MySQL
create_table()  # Ensure table exists
if name:  # Only insert if 'name' is not empty
    insert_data(name, happy, sad)
    print("<p>Data successfully stored in the database.</p>")

# Close HTML document
print("</body></html>")
