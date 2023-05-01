import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    '''
    Check if the user is authorized with isAuthorizedUser(userId) method.
    If yes, create a sql query to get account information of the user.
    If there is any error in retrieving the result, throw an exception.
    '''
    query = '''SELECT account_id, account_name, account_type, description FROM account
        WHERE user_id = %s AND account_type <> 'bank' AND disabled = 'no' ''' % (userId)
    result = connection.execute(query)
    if result.rowcount > 0:
        return result
    else:
        raise exception.BadRequest('account not found for user.')

