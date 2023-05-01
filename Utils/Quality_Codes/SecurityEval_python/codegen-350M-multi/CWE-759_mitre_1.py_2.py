import hashlib


def storePassword(userName, Password):
    '''
    Hash the password and update the database with username and hashed password by invoking the updateUserLogin() method
    '''
    salt = hashlib.md5(userName + Password).hexdigest()
    hashpw = hashlib.md5(salt + Password).hexdigest()

    oldPw = User.query.filter(User.Password == salt).all()[0].Password

    rset = User(userName)
    rset.Password = Password
    rset.Login = User.query.filter(User.Password == salt).all()[0].Login
    rset.CreatedBy = User.query.filter(User.Login == salt).