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
    if 'password' in request.form:
        user = MySQLdb.escape(request.form['password'])
        db = MySQLdb.connect(**{'database':'student','host':'www.reddit.com', 'user': user, 'passwd': user})
        db.autocommit = True
        db.execute('USE %s'%user)
        user_id = 1
        db.execute('SELECT id,username,password from student where id=?', [user_id])
        if db.fetchall():
            user_id = db.fetchone()[0]
            username = user