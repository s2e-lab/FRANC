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
        login = request.form.username
        password = request.form.password
        # check if username already registered;
        try:
            db = MySQLdb.connect(host='localhost', db='bk', user='bkuser', passwd=password, charset='utf8')
            c = db.cursor()
            c.execute('SELECT * FROM users WHERE user_username=%(username)s', { 'password': password } )
            row = c.fetchall()
            if row[