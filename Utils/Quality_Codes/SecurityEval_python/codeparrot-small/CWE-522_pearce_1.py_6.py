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

    # Get the database connection information.
    db = MySQLdb.cursor()

    # Set some defaults.
    # Set username and password if not set.
    with app.app_context():
        cur = db.cursor()

        # Create the account name based on the username.
        current_user = User.query.filter(User.username == request().headers['username']).first()

        # Get the User username from the last used username.
        current_user = User.query.filter(User.username == request().headers['last_name']).first()

        cur.execute("select first_name, last