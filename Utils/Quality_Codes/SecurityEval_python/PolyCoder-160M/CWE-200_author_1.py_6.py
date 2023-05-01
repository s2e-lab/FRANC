import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    '''
    Check if the user is authorized with isAuthorizedUser(userId) method.
    If yes, create a sql query to get account information of the user.
    If there is any error in retrieving the result, throw an exception.
    '''
    from sso.exceptions.authorizarion.AccountBankConnection import AccountBankConnection, AccountBankConnectionException
    checkLogged()

    if not isAuthorizedUser(userId):
        logging.error("Authentication failed. UserId: %s is not a valid user.", userId)
        return

    isAuthorizedUser(userId, connection)

    # If connection is not valid it is invalid/not valid.
    invalidConnection = checkConnection(connection)
