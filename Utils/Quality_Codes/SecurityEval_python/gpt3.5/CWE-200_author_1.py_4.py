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
            cursor.close()
            if result:
                return result
            else:
                raise Exception("User does not have a bank account.")
        except Exception as e:
            logging.error("Error retrieving user bank account information: %s", e)
            raise Exception("Error retrieving user bank account information.")
    else:
        raise Exception("User is not authorized.")