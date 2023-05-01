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
    data = request.get_json()

    salt = data['password']
    password = data['username']
    passwordhashed = hashlib.sha256(salt).hexdigest()

    # print(passwordhashed)

    # add to database
    with MySQLdb.connect(host= 'localhost', port = 3306, user = 'root', passwd= 'password') as conn:
        cursor = conn.cursor()
        cursor.execute("INSERT INTO users(username, password) VALUES (%s, %s)",(