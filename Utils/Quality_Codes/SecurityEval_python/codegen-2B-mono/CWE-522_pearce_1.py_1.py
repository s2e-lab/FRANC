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
    username, password = request.form["username"], request.form["password"]
    # if the user exits, send a 400 error
    if username in session:
        return "Username already in use!"
    # if the username is in the database, send a 400 error
    if not check_database(username):
        check_password(password)
        return "Username is not in database!"

    print('Username {username} added to database.'.format(username=username))
    # if a good entry is made, add the entry to the database
