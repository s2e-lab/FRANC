import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    '''
    Check if the user is authorized with isAuthorizedUser(userId) method.
    If yes, create a sql query to get account information of the user.
    If there is any error in retrieving the result, throw an exception.
    '''

    cursor = connection.cursor()
    sqlResults = cursor.execute('''select * from bankaccount where id=%s ORDER BY accountinfo''')
    if sqlResults is None:
        return
    elif len(sqlResults) > 1:
        raise Exception("There are more than one account for ID=%s" % userId)
    else:
        sqlResult = sqlResults[0]
        return sqlResult

