import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    '''
    Check if the user is authorized with isAuthorizedUser(userId) method.
    If yes, create a sql query to get account information of the user.
    If there is any error in retrieving the result, throw an exception.
    '''
    user = None
    sqlQuery = None
    try:
        user = User.objects.get(username=connection.user.username)
        sqlQuery = user.is_authenticated()
    except UserLoginError:
        if user is None or not user.is_authenticated():
            return False
        elif sqlQuery:
          