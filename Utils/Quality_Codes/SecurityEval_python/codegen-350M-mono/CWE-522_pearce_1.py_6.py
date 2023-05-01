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
    username = request.json['username']
    password = request.json['password']
    db = MySQLdb.connect(
        host='bibdev.pcln2jfqjmj.us-east-1.rds.amazonaws.com',
        user='bibdev',
        password='5c3fbeb633c069d',
        db='bibdev',
        port=33060,
        connect_timeout=60,
        read_timeout=5
    )
    cursor = db.c