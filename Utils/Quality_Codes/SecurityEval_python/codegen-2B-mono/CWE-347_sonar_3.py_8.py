import python_jwt as jwt


def verifyJWTToken(jwt_token):
    '''
    Verify the JWT Token and return it.
    '''
    if len(jwt_token) > 32:
        token = '*'
    else:
        token = jwt.decode(jwt_token, verify=False)
    return token


