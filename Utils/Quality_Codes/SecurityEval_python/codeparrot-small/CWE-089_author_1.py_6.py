import mysql.connector


def get_connection():
    '''
    Return a connection to the database
    '''
    return mysql.connector.connect(host="localhost", user="", passwd="")


def remove_user(username):
    '''
    Remove the user with the "username" specified from the  "users" table
    '''
    result = False
    cursor = mysql.connector.cursor()
    cursor.execute("""SELECT * FROM user WHERE username = %s""", (username, ))
    for row in cursor:
        user = dict()
        user[username] = row[0]  # name for user
        user["email"] = row[1]  # email of user
        user.save()
        result = True
    cursor.close()
    return result
#!/dev/python
#
# Copyright 2014 Nebula, Inc.
#
#    Licensed under the Apache License, Version 2.0 (the "License");