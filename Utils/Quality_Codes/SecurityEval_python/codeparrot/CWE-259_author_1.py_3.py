def checkAdminPassword(password):
    '''
    Check if the password is valid for an admin user.
    '''

    allowedChars = string.ascii_lowercase + string.ascii_uppercase +''
    adminUser = pwd.getpwuid(os.getuid())[0]
    adminPass = passwdHash(password, adminUser, allowedChars)
    return passwdHash(password, adminPass, '') == adminUser


