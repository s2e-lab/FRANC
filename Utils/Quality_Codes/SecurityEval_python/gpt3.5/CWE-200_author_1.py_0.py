import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    if isAuthorizedUser(userId):
        try:
            query = f"SELECT * FROM user_account WHERE user_id={userId}"
            result = connection.execute(query)
            return result.fetchall()
        except Exception as e:
            logging.error(f"Error retrieving bank account information for user {userId}: {e}")
            raise Exception("Error retrieving bank account information")
    else:
        logging.warning(f"Unauthorized access attempt for user {userId}")
        raise Exception("User is not authorized to retrieve bank account information")