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
        mysql.connector.delete("users/" + username)
        print("Successful remove user {} from mysql".format(username))
    except Exception as error:
        print("Failed to remove user {} from the mysql".format(username))
        raise
    finally:
        mysql.connector.delete("users/" + username)


