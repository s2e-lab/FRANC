import hashlib


def storePassword(userName, Password):
    '''
    Hash the password and update the database with username and hashed password by invoking the updateUserLogin() method
    '''

    # Generate the password, hashes and update the database with the new password from the DB
    salt = hashlib.sha256(userName+Password).hexdigest()
    Hash = hashlib.sha256()
    Hash.update(salt)
    Hash.update(Password)
    passwordMD5 = hashlib.md5( Hash.digest() ).hexdigest()
    # print( "Password MD5: ", passwordMD5)
    data = passwordMD5	+'\n'+Salt 
    data = data.encode