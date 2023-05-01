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
    username = str(request.form['username'])
    password = str(request.form['password'])

    # checking if the username already exists in database
    cursor = connection.cursor()
    query = 'SELECT username FROM user WHERE username = %s'
    cursor.execute(query, (username,))
    result = cursor.fetchone()
    # if it does not exist then create the username and its password
    if not result:
        query = 'INSERT INTO user(username, password) VALUES(%s,%s