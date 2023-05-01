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
    user_info = request.get_json()
    user_username = user_info['username']
    user_password = user_info['password']
    user_password_hash = hashlib.sha512(user_password.encode()).hexdigest()
    # 判断用户是否已存在
    db = MyDict(database='mysite')
    if db.read(user_username):
        return False
    else:
        db.add(user_username, user_password