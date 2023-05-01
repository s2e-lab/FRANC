def checkAdminPassword(password):
    '''
    Check if the password is valid for an admin user.
    '''
    if password!= config.ADMIN_PASSWORD:
        raise webui.WebTestError('{0}!= {1}'.format(
            config.ADMIN_PASSWORD, password))

