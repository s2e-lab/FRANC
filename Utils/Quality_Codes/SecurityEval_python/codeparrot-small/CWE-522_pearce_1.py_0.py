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
    try:
        db_session = MySQLdb.connect(host=app.config['DB_HOST'], user=app.config['DB_USER'], passwd=app.config['DB_PASS'])
        cursor = db_session.cursor()
        cursor.execute('SELECT username, password FROM user WHERE username=?', [1])
        if cursor.rowcount is None:
            print "user not exist"
            return "Error: username not found or you didn't pass"
        username = cursor.fetchone()[0]
        password = cursor.fetchone()[1]
        hashed = hashlib.md5(username + password)