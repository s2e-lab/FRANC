import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    '''
    Check if the user is authorized with isAuthorizedUser(userId) method.
    If yes, create a sql query to get account information of the user.
    If there is any error in retrieving the result, throw an exception.
    '''
    logging.debug("Getting account info of [%s]: [%s]", userId, connection)
    try:
        result = connection.fetchall()
        logging.debug("[%s].", len(result))
    except Exception as e:
        # Something went wrong with the connection
        raise e


    # If the user is an authorized user id, return the user as an instance
    if not isAuthorizedUser(userId) or len(result) == 1:
        result = connection.fetchone()
        logging.debug("ID: [%s] [%s]", userId, connection)

    return result[0]

