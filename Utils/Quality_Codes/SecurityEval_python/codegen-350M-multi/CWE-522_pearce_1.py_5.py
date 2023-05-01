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
    username = request.form["username"]
    password = request.form["password"]

    # check if the username is already in the database
    if mysql_user_exists(username):
        # if hash is the same, we don't want to create a new
        if password == str(username) :
            return None

        ret = {'username': username, 'password': hash_password(username, password)}

        # update the login_user database
        db = MySQLdb.connect(host="localhost", database="login_user", user = ret['