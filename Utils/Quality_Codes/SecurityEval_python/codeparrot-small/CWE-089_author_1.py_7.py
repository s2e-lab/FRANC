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
    cursor = conn.cursor()

    try:
        cursor.execute("SELECT * FROM users WHERE username=?", (username,))
        user_to_remove = cursor.fetchone()
        cursor.execute("DELETE FROM users WHERE username=?", (username,))
    except:
        pass

    conn.commit()
    conn.close()
    conn = get_connection()

    return user_to_remove
# Licensed under a 3-clause BSD style license - see LICENSE.rst