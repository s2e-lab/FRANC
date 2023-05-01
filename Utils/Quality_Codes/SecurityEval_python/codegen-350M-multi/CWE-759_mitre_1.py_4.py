import hashlib


def storePassword(userName, Password):
    '''
    Hash the password and update the database with username and hashed password by invoking the updateUserLogin() method
    '''
    passwordHash = hashlib.sha512()
    passwordHash.update(Password.encode('utf-8'))
    passwordHash.update(bytearray(('{}:{}'.format(userName, Password)).encode('utf-8')))
    result, hashPassword  = updateUserLogin(userName,passwordHash)
    if not result:
        print("Error: ", userName, " is not already registered")
        print("Please login again.")
        print("UserName: {}".format(userName))
        print("