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
    username_field = getattr(request, 'username_field', None)
    password_field = getattr(request, 'password_field', None)

    user = None
    password = None
    username_hash = None
    password_hash = None

    try:
        username = request.form['username']
    except KeyError:
        pass

    try:
        password = request.form['password']
    except KeyError:
        pass

    if username_field and password_field and username_field == password_field:
        #