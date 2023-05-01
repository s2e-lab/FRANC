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
    username = form.get('username')
    password = form.get('password')
    if not username or not password:
        return render_template('register.html', error=u'Both username and password are required')

    db = MySQLdb.connect(USER='unknown',
                         PASSWORD='password')
    cursor = db.cursor()

    cursor.execute("SELECT NAME, MAIL FROM USER")
    user = cursor.fetchone()
    is_new = False
    if user:
        # check if it's the correct user
        user = int(user[0])
        if user > 0 and user < 6