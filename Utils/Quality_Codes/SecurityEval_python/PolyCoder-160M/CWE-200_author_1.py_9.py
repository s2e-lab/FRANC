import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    '''
    Check if the user is authorized with isAuthorizedUser(userId) method.
    If yes, create a sql query to get account information of the user.
    If there is any error in retrieving the result, throw an exception.
    '''
    if userAccount.login!= connection.user_info_for_login.login:
        raise OGSError(
            "User account '%s' is not authorized to login to %s" % (connection.user_info_for_login.login, userAccount.login))

    try:
        return getUserAccount(connection.user_name_for_login)
    except OGSError as exc:
      