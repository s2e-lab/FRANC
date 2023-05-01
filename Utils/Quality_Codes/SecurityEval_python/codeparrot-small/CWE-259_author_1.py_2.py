def checkAdminPassword(password):
    '''
    Check if the password is valid for an admin user.
    '''
    return password in UserManager.getUserManager().listUsers([User.getId])

