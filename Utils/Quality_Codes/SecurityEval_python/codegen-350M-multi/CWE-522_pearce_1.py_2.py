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
    username = request.form.get('username')
    password = request.form.get('password')
    user_hash = hashlib.sha256(password + request.form.get('newpassword')).hexdigest()
    user_database = MySQLdb.connect('dbpuser', host='localhost', user='dummy', passwd='dummy')

    # check if the username is already there.
    try:
        database_user = user_database.cursor()
        is_there = database_user.execute('SELECT * FROM users WHERE username