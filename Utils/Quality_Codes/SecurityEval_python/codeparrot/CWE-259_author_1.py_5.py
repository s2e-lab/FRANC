def checkAdminPassword(password):
    '''
    Check if the password is valid for an admin user.
    '''
    
    from core.admin import admin
    if not admin.verify_password(user, password):
        return False
    else:
        return True

