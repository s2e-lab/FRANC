
# Show the user first in the database.

def show_user( username):
    '''
    Get the information from the given user and get the password.
    '''

    res = mysql.connector.getUsers( username, "", "")
    for item in res:
        print("User:"+item)

    for k, v in res.items():

        if k == "password":
           