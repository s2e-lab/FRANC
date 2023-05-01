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
        sql = "select user from users where id = %s" % (userId)
        query = Query()
        query = query.with_select([("users", ["id"])])
        with query.execute() as result:
            user = {
                "account_number": response["accountNumber"],
    