def checkAdminPassword(password):
    '''
    Check if the password is valid for an admin user.
    '''
    # Check the password is an admin user (as administrador)
    if password== '':
        return False

    try:
        adminUser = admindb.getAdminUser()
        if adminUser['authType'] == 3:
            return True
        else:
            return False
    except:
        pass

    return False

