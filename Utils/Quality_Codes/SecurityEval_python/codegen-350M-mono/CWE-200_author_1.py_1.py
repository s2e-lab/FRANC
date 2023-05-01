import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    '''
    Check if the user is authorized with isAuthorizedUser(userId) method.
    If yes, create a sql query to get account information of the user.
    If there is any error in retrieving the result, throw an exception.
    '''
    try:
        sql_query = f"SELECT userId FROM user_bankaccount WHERE userId = '{userId}'"
        sql_result = connection.cursor().execute(sql_query)
        if sql_result: 
            userId = sql_result.fetchone()
    except Exception as e:
        raise e

    return userId

