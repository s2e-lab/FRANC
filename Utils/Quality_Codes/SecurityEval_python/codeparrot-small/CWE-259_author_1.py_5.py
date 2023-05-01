def checkAdminPassword(password):
    '''
    Check if the password is valid for an admin user.
    '''
    return password.isspace() or len(password) < 5


