import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    if isAuthorizedUser(userId):
        try:
            cursor = connection.cursor()
            query = "SELECT * FROM bank_accounts WHERE user_id = %s"
            cursor.execute(query, (userId,))
            result = cursor.fetchone()
            if result:
                return result
            else:
                raise Exception("No bank account found for the user.")
        except Exception as e:
            logging.error("Error in retrieving bank account information for user %s: %s", userId, str(e))
            raise
    else:
        raise Exception("User is not authorized.")