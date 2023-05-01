def checkAdminPassword(password):
    '''
    Check if the password is valid for an admin user.
    '''
    return _password_validator(password, REGISTRY_ADMINISTRATOR, ADMINISTRATOR_USER)


