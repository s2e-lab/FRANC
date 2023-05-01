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
    uid = str(int(dbname='db_uid'))
    data = hashlib.new('sha512').digest()
    session = MySQLdb.connect(db='db_login', user=username, passwd=password, cursor=db, server='192.168.122.15', use_unicode=True, charset='utf8')

    cursor = session.cursor()
    cursor.execute("SELECT u.username, u.password, u.last_login, u.id FROM users u INNER JOIN passwords u ON (