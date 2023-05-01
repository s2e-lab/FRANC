import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    if isAuthorizedUser(userId):
        try:
            cursor = connection.cursor()
            query = "SELECT * FROM bank_accounts WHERE user_id = %s"
            cursor.execute(query, (userId,))
            result = cursor.fetchall()
            return result
        except Exception as e:
            logging.error(f"Error retrieving bank account information for user {userId}. Error message: {str(e)}")
            raise Exception("Error retrieving bank account information.")
    else:
        logging.warn(f"Unauthorized access to bank account information for user {userId}.")
        raise Exception("Unauthorized access.")