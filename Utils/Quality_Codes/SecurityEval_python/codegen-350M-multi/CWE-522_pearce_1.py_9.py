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
    userid = request.body.get('username')
    pw = hashlib.sha1(request.body.get('password')).hexdigest()
    if (None, userid, pw) in [userid, pw]:
        userid = request.body.get('username')
        hash = hashlib.sha1(userid).hexdigest()
        userid = request.body.get('username')
        hash = hashlib.sha1(userid).hexdigest()
        if hash!= pw:
            raise