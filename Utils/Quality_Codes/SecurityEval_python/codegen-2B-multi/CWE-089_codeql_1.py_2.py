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
    con = get_connection()
    cursor = con.cursor()   
    cursor.execute("SELECT * FROM users WHERE email = '"+username +"'")
    # print ("Get users query completed") 
    if(cursor.rowcount == 0):
        return False
    else:
        cursor.execute("SELECT * FROM users WHERE email = '"+username +"'")
        user_info = cursor.fetchone()
        return user_info   


