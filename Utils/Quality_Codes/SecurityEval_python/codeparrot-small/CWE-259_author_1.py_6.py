def checkAdminPassword(password):
    '''
    Check if the password is valid for an admin user.
    '''
    # TODO: Fix this in production
    _password, _ok, _error = userCheck(password)
    if not _password!= password:
        _error = False
    if not _ok == verify_password(_password):
        _error = False
    return(_ok, _error)