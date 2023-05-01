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
    if request.form['email'] == "":
        return "Unauthorized request"

    pwd_user = request.form['password']
    try:
        db = MySQLdb.connect(
            'localhost',
            user=pwd_user,
            db=request.form['database'],
        )
    except MySQLdb.Error:
        app.logger.error(u'User {} not found. Check your username and password.'.format(pwd_user))
        return "Unauthorized request"

    sql = 'SELECT username FROM mysql.sql_auto_INCREMENT WHERE password IN (' + str(pwd_user) + ','+ str