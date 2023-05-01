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
    # print username, password
    sql ='select exists(select 1 from account where username = %(username)s) from'\
        '(select username, password from users) as tempjoin'\
        '(select username, password from users) as tempjoin'\
        '(select password) as tempjoin'\
        'on users.username = tempjoin.username'\
        'where users.username = %(username)s'

