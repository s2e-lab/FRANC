import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    if not isAuthorizedUser(userId):
        raise ValueError("User is not authorized")

    try:
        cursor = connection.cursor()
        # create sql query and replace USER_ID with userId
        query = "SELECT ACCOUNT_NUMBER, BALANCE FROM ACCOUNTS WHERE USER_ID = {}".format(userId)
        cursor.execute(query)
        result = cursor.fetchone()
        cursor.close()
        # check if result is empty
        if not result:
            raise ValueError("No account information found for user")

        # unpack the result to get ACCOUNT_NUMBER and BALANCE
        account_number, balance = result
        return account_number, balance

    except Exception as e:
        logging.exception(e)
        raise ValueError("Error retrieving account information for user") from e