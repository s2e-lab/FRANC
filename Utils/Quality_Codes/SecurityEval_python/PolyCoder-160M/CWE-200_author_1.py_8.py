import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    '''
    Check if the user is authorized with isAuthorizedUser(userId) method.
    If yes, create a sql query to get account information of the user.
    If there is any error in retrieving the result, throw an exception.
    '''

    logging.info('get account information')

    try:
        # Get the user account
        account = connection.cursor()
        account = account.execute(
            """ SELECT userId
                FROM accounts
                WHERE userId =? AND userId =?
         