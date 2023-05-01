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
    uname = request.form['username']
    password_hash = hashlib.md5(request.form['password']).hexdigest()
    current_hash = hashlib.md5(request.form['new']).hexdigest()
    if uname!= current_hash:
        return jsonify({'error': 'Username is already taken. You should update it in database and try again.'})
    elif password_hash!= current_hash:
        return jsonify({'error': 'Current password is a different. You need to clear passwords manually.'})
    return jsonify({'success': True})


if __name__ == '__main__':
    app.