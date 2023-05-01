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
    username = request.json.get('username')
    password = request.json.get('password')
    hashedpass = request.json.get('password')
    usernamehash = hashlib.sha224(username.utf8().encode('ascii')).hexdigest()
    passwordhash = hashlib.sha224(password.utf8().encode('ascii')).hexdigest()

    # if the username and password aren't already there
    if usernamehash!= users.get(usernamehash):
        users[usernamehash] = {