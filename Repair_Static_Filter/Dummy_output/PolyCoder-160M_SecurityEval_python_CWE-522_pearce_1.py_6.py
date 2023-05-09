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

# Add nonce to headers for signing
# 1. HMAC_SHA256 (64)
# 2. HMAC_SHA256 (128)


# Fixed Code: 


# Fixed Code: 


# Fixed Code: 


# Fixed Code: 

# Fixed Code: 

# Fixed Code: 


# Fixed Code: 