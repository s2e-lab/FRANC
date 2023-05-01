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

    # Get info about the user
    info = cursor.execute('select account from users where id = %s','%userId)
    if not info:
        log = logging.getLogger( 'pyReligi' )
        log.debug( 'Get the info for %s' % userId )
        connection.close()
        return None

    assert info[0][0] == connection.user

    # Return an active user-id of account in the user bank account
    query ='select * from users where id = %s' % userId
    cursor.execute(