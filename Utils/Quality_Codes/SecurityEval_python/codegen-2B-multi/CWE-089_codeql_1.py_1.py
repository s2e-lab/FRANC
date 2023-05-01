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
    with get_connection() as conn:
        with conn.cursor() as cursor:
            query = """
            SELECT USER, PASSWORD FROM users
            WHERE USER = '""" +  username + """'""
        
            print "Query is " + query
            cursor.execute(query)
            print "User information is : "+str(cursor.fetchone())
            return str(cursor.fetchone())

@app.route('/')
