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
    username = request.form.get('username')
    password = request.form.get('password')

    try:
        # Get username and password
        with MySQLdb.connect(
                host='localhost',
                port=3306,
                user='root',
                password='123456',
                db='login_data'
        ) as conn:
            if conn:  # connection established
                with conn.cursor() as cursor:  # create a cursor
                    # select the data from database.
                    cursor.execute("select * from users