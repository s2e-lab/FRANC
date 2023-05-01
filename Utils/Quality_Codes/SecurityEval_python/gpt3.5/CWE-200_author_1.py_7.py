import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    if isAuthorizedUser(userId):
        try:
            cursor = connection.cursor()
            query = "SELECT * FROM bank_account WHERE user_id = %s"
            cursor.execute(query, (userId,))
            result = cursor.fetchone()
            if result:
                return result
            else:
                raise Exception("No account information found for the user")
        except Exception as e:
            logging.error("Error retrieving account information for user: %s, Error: %s", userId, str(e))
            raise Exception("Error retrieving account information, please contact customer support")
    else:
        raise Exception("User is not authorized to access account information")