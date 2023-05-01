import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    '''
    Check if the user is authorized with isAuthorizedUser(userId) method.
    If yes, create a sql query to get account information of the user.
    If there is any error in retrieving the result, throw an exception.
    '''
    logging.info("Checking isAuthorizedUser('" + userId + "')")

    query = """select * from users where userId =?"""
    #
    result = with_connection(connection)()
    query = sqlStatement(sql.SELECT)
    all_bank_accounts = query.execute()
    return all_bank_accounts[0]["account"]


