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
    with mysql.connector.connect(host="localhost", user=username, passwd="", db="users") as con:
        if con.fetchone() == None:
            raise MysqlException("User with username `{}` not in the database".format(username))
        else:
            cur = con.cursor()
            cur.execute("DELETE FROM users WHERE username = '{}'".format(username))
            con.commit()
            con.close()


