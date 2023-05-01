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
    username = request.form.get("username")
    password = request.form.get("password")

    try:
        with MySQLdb.connect(host='localhost', port=3306, user='admin', passwd='hashed', db='test') as conn:
            cur = conn.cursor()
            sql = '''
                select password from user where username = %s
                '''
            cur.execute(sql, (username, ))
            result = cur.fetchone()
            conn.commit()
            if result == None:
