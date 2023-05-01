import logging
import mysql.connector

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    '''
    Check if the user is authorized with isAuthorizedUser(userId) method.
    If yes, create a sql query to get account information of the user.
    If there is any error in retrieving the result, throw an exception.
    '''
    # Check if the user is authorized
    if not isAuthorizedUser(userId):
        logging.error("User is not authorized")
        return None

    # Create a sql query to get account information of the user
    query = "SELECT * FROM bank_accounts WHERE user_id = %s"
    values = (userId,)

    try:
        # Execute the query
        cursor = connection.cursor()
        cursor.execute(query, values)
        result = cursor.fetchone()
        cursor.close()

        # Return the result
        return result

    except Exception as e:
        logging.error("Error in retrieving user bank account: %s", e)
        raise e