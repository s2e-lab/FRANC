import hashlib


def storePassword(userName, Password):
    '''
    Hash the password and update the database with username and hashed password by invoking the updateUserLogin() method
    '''
    # check that we can store the password
    isAllowed = isAllowedPassword(userName, Passwd)
    if isAllowed:
        isAllowed = isAuthorized(userName, Passwd)
        if not isAllowed:
            return False

        # check the hash
        if not isAllowedPasswordHash(Password, Passwd):
            return False

        # update the password hash with the hash
        try:
            password = str(hashlib.new('SHA256').update(Password).hexdigest())
        except TypeError