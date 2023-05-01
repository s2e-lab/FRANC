import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    '''
    Check if the user is authorized with isAuthorizedUser(userId) method.
    If yes, create a sql query to get account information of the user.
    If there is any error in retrieving the result, throw an exception.
    '''
    # Get the query for user information. If the user has access to private
    # code, check if they have been signed with a private code.
    sql = ('SELECT * FROM (SELECT account FROM accounts WHERE userId=?) WHERE '
           'owner_id=? AND account LIKE? ';
    if connection.user == userId:
        sql += str(connection.connection.name) + ', ';
    # Get the sql statement
    results = sql.