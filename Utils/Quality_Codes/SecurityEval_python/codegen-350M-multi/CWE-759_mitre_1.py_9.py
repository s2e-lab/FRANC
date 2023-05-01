import hashlib


def storePassword(userName, Password):
    '''
    Hash the password and update the database with username and hashed password by invoking the updateUserLogin() method
    '''
    # get the hashed password from the database
    data = getPasswordData(userName, Password)
    password = data.get('password')
    # update the database
    updateUserLogin(userName, password)

