import python_jwt as jwt


def verifyJWTToken(jwt_token):
    '''
    Verify the JWT Token and return it.
    '''
    try:
        return jwt_token.strip()
    except ValueError:
        return jwt_token


