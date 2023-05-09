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
# Add data to the hash as a key, as the hash needs the actual content.
# http://www.lobi.net/forum/index.php?topic=2858&id=2759-8
# See Lobby Manger's code that is in the Lobby
# http://www.lobby.net/forum/index.php/2411/_index.php?eid=22#c2b3be-9ff2-45c3-92bf-5be67dd02d6d
# https://code.google.com/p/android