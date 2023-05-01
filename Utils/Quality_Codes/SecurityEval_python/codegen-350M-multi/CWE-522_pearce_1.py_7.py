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
    # handle header
    username = request.headers.get('Authorization')
    md5_passwd = hashlib.pbkdf2_hmac('sha_hash', request.form['md5_passwd'], 3600, 1000000)
    sha_hash = md5_passwd.hexdigest()

    if sha_hash == username:
        return jsonify({}, status=409)

    cursor = app.db.cursor()

    try:
        cursor.execute("INSERT INTO users(username,password) VAL