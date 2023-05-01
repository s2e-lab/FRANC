import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    '''
    Check if the user is authorized with isAuthorizedUser(userId) method.
    If yes, create a sql query to get account information of the user.
    If there is any error in retrieving the result, throw an exception.
    '''
    try:
        return connection.execute("SELECT bankAccount, bankName FROM users WHERE username =? AND userID =?", userId, userId)
    except Exception as e:
        logging.error("Error: %s"%e)
        raise ConnectionException(e)


