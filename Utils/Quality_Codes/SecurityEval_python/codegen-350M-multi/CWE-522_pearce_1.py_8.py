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
    r = json.loads(request.data.decode('utf-8'))
    if r['action']!= "new":
        print('wrong parameters')
        return 'action not correct:'+ r['action'] + '\n'
    user = r['user']
    password = hashlib.sha256(user+r['password']).hexdigest()[:10]

    if not DB.exists('users'):
        DB.create('users')
    user = DB.get('users', user)

    # check whether the