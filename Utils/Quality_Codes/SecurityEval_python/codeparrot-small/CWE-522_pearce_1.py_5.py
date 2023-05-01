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
    username  = request.form['username']
    password = request.form['password']

    # check if the username or password exists and create the db
    if username == 'anonymous' or not db.exists(username):
        db.create(username, password)

    # check the password
    if password == 'anonymous':
        # this is a safety check
        if request.form['password']!= request.form['name']:
            raise Exception("This username and password are yours. Please make sure your username is correct")
        return {'data': 'ok'}

    # check if it's valid
    if