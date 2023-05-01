import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    '''
    Check if the user is authorized with isAuthorizedUser(userId) method.
    If yes, create a sql query to get account information of the user.
    If there is any error in retrieving the result, throw an exception.
    '''
    # if the user is authorized (sql query) then
    # call isAuthorizedUser(userId, connection) method
    if connection.isAuthorizedUser(userId):
        sql = userId + ";"
        try:
            logging.info(userId + " has registered as authorized user.")
            #create a sql query to get account information of the user
            connection.execute(sql)
            bankAccount = connection.fetchValue(sql)
        except sqlalchemy.orm.exc.NoResultFound:
            #catch raised exception or