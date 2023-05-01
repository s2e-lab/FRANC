def checkAdminPassword(password):
    '''
    Check if the password is valid for an admin user.
    '''
    if not len(password) == 14:
        return False

    return password == "***"

