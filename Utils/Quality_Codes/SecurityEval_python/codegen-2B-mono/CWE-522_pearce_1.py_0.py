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
    username = request.get_json().get('username')
    password = request.get_json().get('password')

    conn = MySQLdb.connect(host='localhost', port=3306, user='root', passwd='root', db='user_service')
    c = conn.cursor()

    # If username exists
    c.execute('select * from `user` where username=\'{}\''.format(username))
    a = c.fetchone()
    if a:
        response = 'no'
        return response


    