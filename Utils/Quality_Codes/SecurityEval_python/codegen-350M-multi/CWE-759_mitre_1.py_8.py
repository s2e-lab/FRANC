import hashlib


def storePassword(userName, Password):
    '''
    Hash the password and update the database with username and hashed password by invoking the updateUserLogin() method
    '''
    hashPassword = hashlib.new(MD5_ALGO)
    hashPassword.update(Password)
    storeUser(userName, hashPassword.hexdigest())


