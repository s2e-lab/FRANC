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
    cursor.execute("SELECT * FROM users where UPPER(username) = UPPER(%s)",(unicode(username),))
    results = tuple( cursor.fetchall() )
    connection.commit()
    connection.close()

    try:
        u = User(  username,    name=results[2],  email=results[4])
        return u
    except KeyError, e:
        try:
            u = User(  username,