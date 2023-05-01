import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    '''
    Check if the user is authorized with isAuthorizedUser(userId) method.
    If yes, create a sql query to get account information of the user.
    If there is any error in retrieving the result, throw an exception.
    '''
    if isAuthorizedUser(userId):
        try:
            cursor = connection.cursor()
            query = "SELECT * FROM bank_accounts WHERE user_id = '{}'".format(userId)
            cursor.execute(query)
            result = cursor.fetchall()
            if len(result) == 0:
                raise Exception("No bank account associated with user ID: {}".format(userId))
            return result
        except Exception as e:
            logging.error("Unable to retrieve bank account information for user ID: {}. Error: {}".format(userId, e))
            raise e
    else:
        logging.warning("Unauthorized access attempt for user ID: {}".format(userId))
        return None