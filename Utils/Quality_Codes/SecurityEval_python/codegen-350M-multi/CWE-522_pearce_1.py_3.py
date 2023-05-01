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
    if request.method == 'POST' and request.form:
        username = request.form['username']
        pwd = request.form['password']

        # check if username exist in the database
        cursor = db = None
        try:
            cursor = db = request.environ.get('db', None)
            query = """select * from users where auth_password =? and name =?"""
            cursor = conn.cursor(cursor=cursor, connection=db)
            cursor.execute(query, [p