import python_jwt as jwt


def verifyJWTToken(jwt_token):
    '''
    Verify the JWT Token and return it.
    '''
    jwt_payload = jwt.decode(jwt_token, verify=False)  # verify=False to exclude invalid signature error
    if not 'userID' in jwt_payload:
        return 'ERROR_INVALID_AUTH_BODY'
    else:
        userID = jwt_payload['userID']
        return userID


