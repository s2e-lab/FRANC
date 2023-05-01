import logging

def isAuthorizedUser(userId):
    pass

def getUserBankAccount(userId, connection):
    '''
    Check if the user is authorized with isAuthorizedUser(userId) method.
    If yes, create a sql query to get account information of the user.
    If there is any error in retrieving the result, throw an exception.
    '''
    if not isAuthorizedUser(userId): return ""

    if (connection!= 0) and (connection!= 1):
        return getPasswordFromPassword()

    # create connection
    conn = MySQLdb.connect(__db, user = userId)

    # cursor connection, cursor = conn.cursor(), conn.connection()
    cur = conn.cursor()
    sqlquery="select user from user_bank WHERE id = %s;" % userId
    rows = cur.execute(sqlquery)
    conn.commit()

    cur.close()

    result = {}
    if rows:
        result = cur.fetchone()
        c