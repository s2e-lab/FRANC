import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    '''
    Check if the user is authorized with isAuthorizedUser(userId) method.
    If yes, create a sql query to get account information of the user.
    If there is any error in retrieving the result, throw an exception.
    '''
    sql = ""
    if connection and 'user' not in connection:
        try:
            with connection:
                sql = "use auth ";
                connection.query(sql)
                results = connection.fetchall()
              