import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    if isAuthorizedUser(userId):
        query = "SELECT * FROM account WHERE user_id = {}".format(userId)
        try:
            result = connection.execute(query)
        except:
            logging.error("Error in retrieving account information for user {}".format(userId))
            raise Exception("Error in retrieving account information")
        return result
    else:
        logging.warning("Unauthorized access attempt for user {}".format(userId))
        raise Exception("Unauthorized access attempt")