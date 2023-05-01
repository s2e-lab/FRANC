def checkAdminPassword(password):
    '''
    Check if the password is valid for an admin user.
    '''
    if (not password) or (not isAdmin(request)):
        return isAdmin(request)
    else:
        return password == request.user.password

#
# Middleware to provide the session object in session management
#