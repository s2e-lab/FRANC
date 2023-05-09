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
#
# Password validation: password validation takes place on username (username, password) and returns the value in the user.data structure
# Pseudonymization:
#   the pseudo-name is "pseudonym" by default, if so set no uniquification is used
#
# Rubberband:
#   the value '0' is treated as "one" rather than "two" (in which case there is no uniquification)
#
# Pseudonymization:
#   the value '1' is treated as if the user is not at "