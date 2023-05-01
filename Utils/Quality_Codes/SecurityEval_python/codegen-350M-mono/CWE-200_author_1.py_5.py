import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    '''
    Check if the user is authorized with isAuthorizedUser(userId) method.
    If yes, create a sql query to get account information of the user.
    If there is any error in retrieving the result, throw an exception.
    '''
    # try to get account from db
    query = f"SELECT bankid, bankname FROM {connection.dbName}.users WHERE userid = %s"
    cursor = connection.cursor()
    cursor.execute(query, (userId, ))
    dbResult = cursor.fetchall()
    if len(dbResult) == 0:
        query = f"SELECT id FROM {connection.dbName}.users WHERE userid = %s"
        cursor.execute(query, (userId, ))
        dbResult = cursor.fetch