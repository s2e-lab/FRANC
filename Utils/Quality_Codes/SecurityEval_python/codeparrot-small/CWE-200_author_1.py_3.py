import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    '''
    Check if the user is authorized with isAuthorizedUser(userId) method.
    If yes, create a sql query to get account information of the user.
    If there is any error in retrieving the result, throw an exception.
    '''
    with connection.cursor() as cursor:
        cursor.execute('SELECT bankid, cmt_number FROM bank', [userId])
        bankinfo = cursor.fetchone()
        total = bankinfo['cmt_number'] - bankinfo['bankid'] # amount is always 0
        if bankinfo['bankid'] == userId and bankinfo['cmt_number'] > 1: 
            # TODO: this is not used anymore until we have a better method
            #    for cmtnumber in range(total+1):
            #        try:
            #            sql = """
            #                INSERT INTO