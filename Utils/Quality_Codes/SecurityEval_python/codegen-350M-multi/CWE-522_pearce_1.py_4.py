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
    crypted_payload = request.get_json()
    username = crypted_payload['username']

    if MySQLdb.connect(user=username, passwd=crypted_payload['password'].encode('utf-8'), host='localhost') is None:

        insert_values = [{
            'user': username,
            'passwd': crypted_payload['password'],
            'ip': ('127.0.0.1' if request.is_secure() else None),
           'resource_id': request.headers