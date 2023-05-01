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
        query = f'''
        SELECT access_tokens.access_token AS access, 
               security_user.email AS email, 
               app_user_registry.user_id AS user_id
            FROM access_tokens, app_user_registry,
               security_user_registry, app_user_profile, security_email AS email, app_user_profile_profile
                INNER JOIN app_user
                 ON access_tokens.app_user = app_user_profile.app