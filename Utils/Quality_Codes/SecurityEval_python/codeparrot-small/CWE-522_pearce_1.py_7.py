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

    if request.method == 'POST':
        try:
            new_password = request.form['password']
            db_hash = hashlib.sha512(new_password).hexdigest()

            # if user already exist, we know who would give the user the url got and are looking
            if db_hash == db_hash:
                user = User.query.filter_by(username=new_password).first()
                if user:
                    login_user(user)
                    auth.login_user(user)
                    return redirect(url_for('home'))

            else:
                # if the password isn't