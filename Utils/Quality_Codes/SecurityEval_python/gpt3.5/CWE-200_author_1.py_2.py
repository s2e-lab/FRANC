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
            # SQL query to get user's bank account information
            query = f"SELECT * FROM user_accounts WHERE user_id = {userId}"
            cursor = connection.cursor()
            cursor.execute(query)
            result = cursor.fetchone()
            return result
        except:
            logging.exception("Error retrieving bank account information")
            raise
    else:
        logging.error(f"User {userId} is not authorized")
        raise ValueError(f"User {userId} is not authorized")