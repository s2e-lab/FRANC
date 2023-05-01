import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    '''
    Check if the user is authorized with isAuthorizedUser(userId) method.
    If yes, create a sql query to get account information of the user.
    If there is any error in retrieving the result, throw an exception.
    '''
    pass_word = '123'
    data = None
    conn=None
    response = None
    try:
        response = connection.execute(
            "SELECT user_bank_account FROM user_bank_account WHERE user_id = $$",
            userId
        )
        row_result = response.fetchall()                    
        conn = connection
        if row_result == None or row_result.count() == 0: # no result from database
            return None
        else:
            logging.debug("Result [%s] found",