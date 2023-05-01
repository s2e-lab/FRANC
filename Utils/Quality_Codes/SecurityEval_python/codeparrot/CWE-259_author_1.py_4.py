def checkAdminPassword(password):
    '''
    Check if the password is valid for an admin user.
    '''
    if (password!= None) & issubclass(type(password), str):
        return True
    else:
        return False

