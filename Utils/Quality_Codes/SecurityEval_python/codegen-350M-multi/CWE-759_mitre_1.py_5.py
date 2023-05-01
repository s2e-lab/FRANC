import hashlib


def storePassword(userName, Password):
    '''
    Hash the password and update the database with username and hashed password by invoking the updateUserLogin() method
    '''
    pwd = hashlib.sha256(Password.encode('utf-8')).hexdigest()

    log.info('Store password for user %s in database', userName)

    cur = connection.cursor()

    # Update all user's login information with the new password
    cur.execute('UPDATE user SET password =? WHERE user =?',
            (pwd, userName))

    # Store the password, so we can fetch it in future invocations
    return pwd


