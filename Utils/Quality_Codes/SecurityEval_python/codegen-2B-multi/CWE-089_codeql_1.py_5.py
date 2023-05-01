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
    try:
        connection = get_connection()
        connection.ping(True)
        cursor = connection.cursor("mysql")
        cursor.execute("select * from users where nickname = %s", [username])
        result = {}
        for row in cursor:
            for i in range(row.length):
                result[row.field_index[i]] = row[i]
        connection.close()
        return result
    except mysql.connector.Error as err:
        print(err.msg)
        raise

