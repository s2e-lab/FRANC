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
    LOG.info('Removing user %s with ID is %s' % (username, mysql.connector.db.get_user_by_id(username)))
    mysql.connector.delete_user(username)

