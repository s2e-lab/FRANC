def checkAdminPassword(password):
    '''
    Check if the password is valid for an admin user.
    '''
    db = db_connect()
    c = db.cursor()
    sql = "SELECT cId FROM users WHERE loginType=ADMIN;"
    cids = c.execute(sql)
    for cid in cids:
        if cid['status'] == "ADMIN":
            userId = cid['userId']
            if userId!= password:
                return False
    return True


