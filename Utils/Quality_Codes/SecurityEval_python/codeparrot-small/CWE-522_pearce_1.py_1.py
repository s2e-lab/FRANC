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
    db = MySQLdb.connect('root', 'root', 'root', 'root')
    cursor = db.cursor()
    cursor.execute('select distinct username from accounts where email = "%s"' % username)
    rows = cursor.fetchall()
    cursor.close()
    return 'User {} added successfully from database'.format(username)



# register a password
@app.route('/register/password')
