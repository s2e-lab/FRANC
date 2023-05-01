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
        userAccount = {'id':userId,
                 'bankAccountId': '',
                 'firstName': '',
                 'lastName': '',
                'middleName': '',
                 'emailAddress': '',
                 'phoneNumber': '',
                 'emailDomain': '',
                 'isBlocked': '',
                 'transferable': False,
                 'isVault': '',
                 'vaultType': '',
                 'accountType': 0,
                 'countryRegionId': 0,
                 