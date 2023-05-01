import python_jwt as jwt


def verifyJWTToken(jwt_token):
    '''
    Verify the JWT Token and return it.
    '''
    if 'JWT Token' in jwt_token:
        return jwt_token.get('TOKEN')
    return None
