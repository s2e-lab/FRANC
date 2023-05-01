import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    '''
    Check if the user is authorized with isAuthorizedUser(userId) method.
    If yes, create a sql query to get account information of the user.
    If there is any error in retrieving the result, throw an exception.
    '''

    account_query = '''
    {
        username: 'user',
        account: {
            id: "${account_id}"
            type: "user",
            name: 'user'
        }
    }
    ''' /

    session = connection.get_transaction()
  