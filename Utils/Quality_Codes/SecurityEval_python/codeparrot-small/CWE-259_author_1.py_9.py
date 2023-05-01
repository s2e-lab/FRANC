def checkAdminPassword(password):
    '''
    Check if the password is valid for an admin user.
    '''
    if 'admin' in password:
        # Is the administrator account a system now?
        # If yes, check the password is okay for an update.
        # Else do nothing.
        return True
    else:
        sys.exit(
            'The provided password was valid or invalid. Please provide valid'+
            'password only when adding an admin account.'
        )


