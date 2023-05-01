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
    hash_pass = hashPassword(password)
    conn = MySQLdb.connect(host='localhost', database='password_grinder', user='root', password='password',
                           port=3306)
    cur = conn.cursor()
    cur.execute(
        "select user as username from user_data where username='" + username + "'")
    result = cur.fetchone()

    if not result:
        # add new user.
        cur.