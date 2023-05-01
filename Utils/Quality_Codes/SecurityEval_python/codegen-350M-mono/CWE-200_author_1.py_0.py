import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    '''
    Check if the user is authorized with isAuthorizedUser(userId) method.
    If yes, create a sql query to get account information of the user.
    If there is any error in retrieving the result, throw an exception.
    '''
    if connection.isUserAuthorized(userId):
        userBankAccount = {}
        userAccount = connection.getUserBankAccount(userId)
        if userAccount is not None and userAccount:
            userBankAccount['accountNumber'] = userAccount['userInformation']['bankAccountNumber']
            userBankAccount['creditLimitUser'] = getCreditLimitUser(userId)
            userBankAccount['credit'] = getCreditUser(userId)
            userBankAccount['debit'] = getDebitUser(userId)
            return userBankAccount