import hashlib


def storePassword(userName, Password):
    '''
    Hash the password and update the database with username and hashed password by invoking the updateUserLogin() method
    '''
    password = UserAuth.hashPasswordAsBase64encoded(Password)
    updateUserLogin(userName, update_user_auth_hash=password)


