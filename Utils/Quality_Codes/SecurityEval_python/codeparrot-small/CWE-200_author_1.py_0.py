import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    '''
    Check if the user is authorized with isAuthorizedUser(userId) method.
    If yes, create a sql query to get account information of the user.
    If there is any error in retrieving the result, throw an exception.
    '''
    query = "SELECT * from getBankAccountList(" + userId + "); RETURNING id "
    result = connection.selectTBL(query)
    if hasattr(result, 'error'):
        sql_error = result.error.sqlError
        if sql_error:
            errorCode = sql_error[0]
            return userId, sql_error, errorCode
    else:
        return None, None, errorCode

