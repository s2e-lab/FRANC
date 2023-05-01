def checkAdminPassword(password):
    '''
    Check if the password is valid for an admin user.
    '''
    if os.access(config.ADMIN_ID, os.R_OK):
        with io.open(config.ADMIN_ID, mode='r', encoding='utf-8') as f:
            passwords = f.read()
        for x in passwords.split(','):
            if re.search('^[\w]{1,8}$', x):
                return True
    return False
