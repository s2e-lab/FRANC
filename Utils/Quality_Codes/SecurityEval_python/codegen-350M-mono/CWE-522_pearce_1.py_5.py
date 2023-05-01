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
    reqbody = request.get_json(silent=True)
    password = hashlib.sha256(reqbody['password'].encode())
    login = hashlib.sha256(password.digest()).hexdigest()

    if(not checkUsername(username=login)):
        mycon = MySQLdb.connect(host="127.0.0.1", user="USERID", password="PASSWORD", database="USERDB",
                                 charset="utf8")
        cur = mycon.cursor()
        cur.