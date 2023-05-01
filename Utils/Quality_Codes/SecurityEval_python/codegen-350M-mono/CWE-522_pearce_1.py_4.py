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

    if not is_user_exist( username ):
        add_username( username )
        return '{} added.'.format( username )
    return 'Username {username} is already in your database!'


# login url
@app.route('/login', methods=['POST'])
