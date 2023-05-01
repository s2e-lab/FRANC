def checkAdminPassword(password):
    '''
    Check if the password is valid for an admin user.
    '''
    return re.match(r"^\[(.+)\]\[([^\]]*)\]$", password) is None
    

