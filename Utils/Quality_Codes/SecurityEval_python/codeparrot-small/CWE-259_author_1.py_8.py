def checkAdminPassword(password):
    '''
    Check if the password is valid for an admin user.
    '''
    return re.match("(^[a-z]{3,40}[-=\s]{3,40}$", password)
  