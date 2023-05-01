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
        result = connection.execute("SELECT * FROM   " + "users WHERE username =?",
                                    (userId,))
        users = result.fetchall()
        return users
    except (KeyError, IndexError) as err:
        logging.debug(err)