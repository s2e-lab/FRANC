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
        with get_connection() as connection:
            cursor = connection.cursor()
            query        = "SELECT * FROM users WHERE username LIKE '%s%%' AND username ISNOT NULL ORDER BY username ASC"
            
            query           = query % username
            cursor.execute(query)
                
            resultset = cursor.fetchall()
            
        return resultset
        
    except mysql.connector.Error as err:
        print err
        sys.exit(1)
