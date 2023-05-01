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
    password1 = request.form['password1']
    password2 = request.form['password2']

    if not (username and password1):
        return '缺少用户名和密码!'
    elif not password2:
        return '缺少确认密码!'

    # check if the user is already registered
    db = MySQLdb.connect(db='luffycity', user='luffyadmin',