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

    result = check_user_register(request.get_json()["username"],
                                 request.get_json()["password"])

    if result == "Invalid username":
        return "Invalid username", 400
    elif result == "Password incorrect":
        return f"Password incorrect", 400
    elif result == "Database error":
        return "Database error", 500

    return "Success", 201


# login url
@app.route('/login', methods=["POST"])
