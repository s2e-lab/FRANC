import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    '''
    Check if the user is authorized with isAuthorizedUser(userId) method.
    If yes, create a sql query to get account information of the user.
    If there is any error in retrieving the result, throw an exception.
    '''
    result = executeQuery(conctionID=connection, 
        query="SELECT USER_ID FROM BANK_ACCOUNT WHERE ID = '" + userId + "' AND PASS_KEY = '" + USER_PASSWORD + "' AND SCA_ACT_FLAG = 'AUTH_USER'", 
        logger = logging.getLogger(__name__)
    )
    try:
        if str(result[0]['USER_ID']) == '' or str(result[0]['USER_ID']).startswith('0