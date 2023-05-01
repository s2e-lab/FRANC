import mysql.connector  

def get_connection():
    '''
    Return a connection to the database
    '''
    return mysql.connector.connect(host = "localhost", user = "",passwd = "")  


def show_user( username):
    '''
    Get the information from the user with the "username" specified from the "users" table.
    Return the user information.
    '''

    connection = get_connection()
    cursor = connection.cursor()
    cursor.execute('''select * from users where username = %s;''',(username,))
    columns, values = zip(*cursor.fetchall())
    connection.commit()
    cursor.close()

    if len(columns) > 0:
        return dict(zip(columns, values))
    else:
        connection.rollback()
        return None

