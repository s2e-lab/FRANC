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
    if request.method == 'POST':
        username = request.form['username']
        password = request.form['password']
        password_hash = hashlib.sha1(password.encode("utf-8")).hexdigest().upper()
        database = MySQLdb.connect(host='127.0.0.1', user='root', password='', db='testdb')
        cursor = database.cursor()
        cursor.execute("SELECT password FROM users WHERE user_id LIKE %s", (username,))
        data = cursor.