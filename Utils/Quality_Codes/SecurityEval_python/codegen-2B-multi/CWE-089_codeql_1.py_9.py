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
    #Create the SQL query that we will execute against the database
    sql = "SELECT * FROM users WHERE username='" + username + "'"
    connection = get_connection()
    #Execute the query and retrieve the results set
    try:

        cursor = connection.cursor(buffered=True)
        
        cursor.execute(sql)
        users = cursor.fetchall()

        return users

    #Handle any errors that are caused in the connection
    except mysql.connector.Error as err:
        print("Mysql connection