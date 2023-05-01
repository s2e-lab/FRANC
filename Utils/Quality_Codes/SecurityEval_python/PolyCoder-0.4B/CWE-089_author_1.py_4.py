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
    sql = """
       ALTER TABLE users
       DROP USER '{}'
    """.format(username)

    t = mysql.connector.execute(sql)
    t.execute(clearDbCache = "clean")


