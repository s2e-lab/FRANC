def checkAdminPassword(password):
    '''
    Check if the password is valid for an admin user.
    '''
    auth = (None if settings.adminPassword else settings.adminPassword)
    if auth:
        auth = auth.lower()

        # check if the user is still active
        isActive, token = user.isLoggedIn(auth)

        if isActive:
            # there is a cookie
            authToken = None
        else:
            # there is no cookie
            authToken = user.generateToken(password)

        # check if the user wants to check his administrative features
        isAdmin = user.isAdmin(authToken)
        if authToken is not None and not isAdmin:
            return 'Invalid password