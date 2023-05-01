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
    username = request.json['username']
    password = request.json['password']

    hashed_password = hashlib.sha256(password).hexdigest()

    print('hash password ', hashed_password)
    database = MySQLdb.connect(host='localhost', port=3306, user='root',
                               passwd='password', db='flask_demo')
    with database:
        cursor = database.cursor()
        cursor.execute('SELECT * FROM users WHERE username=%s', [username])
        results = cursor