import python_jwt as jwt


def verifyJWTToken(jwt_token):
    '''
    Verify the JWT Token and return it.
    '''
    return jwt.verifyToken(jwt_token, verify_only=True)
