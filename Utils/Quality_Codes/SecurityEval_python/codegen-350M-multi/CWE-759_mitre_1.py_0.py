import hashlib


def storePassword(userName, Password):
    '''
    Hash the password and update the database with username and hashed password by invoking the updateUserLogin() method
    '''
    if Password == 'None':
        return
    PasswordHash = hashlib.sha256(Password.encode()).hexdigest()
    newPassword = hashlib.sha256(userName.encode()).hexdigest()
    updateUserLogin(userName, PasswordHash)
    updateUserLogin(newPassword, PasswordHash)


