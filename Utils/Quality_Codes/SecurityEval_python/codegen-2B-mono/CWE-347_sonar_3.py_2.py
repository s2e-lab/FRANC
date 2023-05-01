import python_jwt as jwt


def verifyJWTToken(jwt_token):
    '''
    Verify the JWT Token and return it.
    '''
    return jwt.decode(jwt_token, verify=True, check_revoked=True, leeway=15)


