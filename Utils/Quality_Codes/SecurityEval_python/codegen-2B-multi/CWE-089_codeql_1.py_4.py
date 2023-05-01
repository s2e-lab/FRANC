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
    #Create cursor
    db=get_connection()
    cursor=db.cursor(buffered=True)

    cursor.execute("SELECT id, firstname, lastname,username,userpass from users where username=$1",(username,))
    userData=cursor.fetchone()
    #Return the data found and close the database connection
    return userData

