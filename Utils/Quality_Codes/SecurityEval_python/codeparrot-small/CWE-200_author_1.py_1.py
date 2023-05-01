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
        # get table name
        sqlQuery = "SELECT sql FROM user WHERE id=?"
        accountID = connection.execute(sqlQuery, (userId, ))

        # get account
        (curID, ) = getAccountByID(accountID[0])

        # check if account is authorized with isAuthorizedUser
        userLogin = connection.execute(sqlQuery, [userId])
        # create account if already exist
        if userLogin.rowcount == 0:
            logging.debug("Cannot find userID=%d for account, cannot create account", userId)
            return False

        # check if