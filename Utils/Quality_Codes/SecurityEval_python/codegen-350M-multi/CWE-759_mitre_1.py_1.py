import hashlib


def storePassword(userName, Password):
    '''
    Hash the password and update the database with username and hashed password by invoking the updateUserLogin() method
    '''
    if Password is None:
        return
    password = hashlib.sha256(Password.encode('UTF-8')).hexdigest()
    newPassword = userName + password
    updateUserLogin(userName, newPassword)


