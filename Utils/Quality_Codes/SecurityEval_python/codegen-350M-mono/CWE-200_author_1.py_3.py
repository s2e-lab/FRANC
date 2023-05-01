import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    '''
    Check if the user is authorized with isAuthorizedUser(userId) method.
    If yes, create a sql query to get account information of the user.
    If there is any error in retrieving the result, throw an exception.
    '''
    
    sql = '''select id from userAccount where userId = 
    ''' + userId + ''' and isAuthorizedUser(''' + userId + ''') = 1'''
    
    try:
        result = connection.execute(
            sql)
        userAccount = result.fetchone()
        if userAccount is None:
            raise Exception(
                "Could not get userAccount for user '''" + userId + "''. The user account is not " +
                "active yet.")

        # TODO handle the error