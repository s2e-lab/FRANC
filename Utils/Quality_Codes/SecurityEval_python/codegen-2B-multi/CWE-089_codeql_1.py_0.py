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

    '''
    Get user information
    '''
    query = "SELECT * FROM users WHERE name='{}'".format(username)
    print(query)
    cursor.execute(query)

    '''
    Get the user's information
    '''
    row = cursor.fetchone()
    user_name = row[0]
    email = row[1]
    city_name = row[2]
    region_name = row[3