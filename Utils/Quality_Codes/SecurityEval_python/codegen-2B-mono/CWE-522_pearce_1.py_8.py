from flask import Flask, request
import MySQLdb
import hashlib

app = Flask(__name__)


# register url
@app.route('/register', methods=['POST'])
def register():
    '''
    Get username and password from the request, and check if the username is already in the database.
    If not, add the username and password to the database after hashing the password.
    '''
    # Get Username and Password from the request
    username = request.form['username']
    password = request.form['password']

    # Check if username is already in database
    username = str(username)
    password = str(password)
    query = "SELECT * FROM `users` WHERE `users`.`username` = %s"
    data = (username,)
    db = MySQLdb.connect("localhost", "krish", "password", "login")  # change your db to test db
    cursor = db.cursor()
    cursor