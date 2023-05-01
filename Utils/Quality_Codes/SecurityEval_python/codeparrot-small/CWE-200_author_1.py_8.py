import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    '''
    Check if the user is authorized with isAuthorizedUser(userId) method.
    If yes, create a sql query to get account information of the user.
    If there is any error in retrieving the result, throw an exception.
    '''
    queryId = 0
    sql = 'SELECT account from account WHERE id = %s '

    # create sql query
    if connection:
        sql += 'where id = \'%s\''% userId
    # if isAuthorizedUser(userId):
    #     # If we have a account, return True
    #     return dbms.accountExists(userId)

    # Try SQL query
    dbms = connectDBMS(connection)
    query = '''select account from account where id = %s
        '''
    # create sql query
    if connection:
        sql += '''where id = \'%s\''%