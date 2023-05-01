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
    data = request.get_json()
    username = data.get('username')
    password = data.get('password')
    salt = data.get('salt')

    # encrypt password using hash_password function and salt
    encryptedpass = encrypt_password(password, salt)

    # save data to database
    try:
        conn = MySQLdb.connect(
            user='root',
            password='password',
            host='0.0.0.0',
            port=3306,
            db='password_manager'
        