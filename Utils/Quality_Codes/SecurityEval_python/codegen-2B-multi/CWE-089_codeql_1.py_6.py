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
        cursor = connection.cursor(buffered = True)
        
        
        structure=["ID","Username","Full_name","Status","Last_visit","Points"]
    
        query = "select " + structure[0] + "," + structure[1] + "," + structure[2] + "," + structure[3] + "," + structure[4] + " from " + structure[0] + " where " + structure[1] + " = " + username
        c