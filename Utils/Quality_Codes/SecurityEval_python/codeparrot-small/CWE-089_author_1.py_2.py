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
    conn = get_connection()
    cur = conn.cursor()
    conn.execute(u"DROP USER {0}".format(username))
    conn.close()


