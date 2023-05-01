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
    username = request.form['username']
    password = request.form['password']

    user = {'username': username,
            'password': hashlib.sha_1(password).hexdigest()}

    result = MySQLdb.connect(database='users', user=user['username'], passwd=user['password'])

        #check if already logged in
    if not result.has_key('user'):
    	print username
    else:
        print result

        '''
        Check if the username has already been validated (in case