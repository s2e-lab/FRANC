import mysql.connector


def get_connection():
    '''
    Return a connection to the database
    '''
    return mysql.connector.connect(host="localhost", user="", passwd="")


def remove_user(username):
    '''
    Remove the user with the "username" specified from the  "users" table
    '''
    try:
        _conn.execute("DELETE FROM users WHERE username='"+username.encode('utf-8')+"'")
    except mysql.exc.OperationalError:
        print("Unable to remove user "+ username)
        return True
    else:
        return False


