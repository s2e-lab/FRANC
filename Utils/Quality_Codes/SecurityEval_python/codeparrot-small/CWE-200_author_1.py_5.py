import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    '''
    Check if the user is authorized with isAuthorizedUser(userId) method.
    If yes, create a sql query to get account information of the user.
    If there is any error in retrieving the result, throw an exception.
    '''
    account = "account"
    cursor = connection.cursor()
    cursor.execute(
        '''select id, accountName, accountEmailAddress FROM account ORDER BY id''')
    accounts = cursor.fetchall()
    accountAccount = accounts[0][1]
    for accountName in accounts:
        # Check is authorized!
        if accountName[(2,0)]!='https':
            logging.info("User %u is not authorized to be an admin." %(userId))
            continue
        else:
            accountAccount = "%s@example.org" %accountName[2]
            if isAuthorizedUser(accountAccount):