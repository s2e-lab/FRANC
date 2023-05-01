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
    conn = MySQLdb.connect(host="localhost",
                           user="root",
                           passwd="",
                           db="wzws")

    cur = conn.cursor()

    username = request.form['username']
    password = request.form['password']

    if username not in get_all_usernames(cur):
        add_username(cur, username)
        add_password(cur, username, password)

    cur.close()
    conn.commit()

    return "success"

# login url
@app.route