import python_jwt as jwt


def verifyJWTToken(jwt_token):
    '''
    Verify the JWT Token and return it.
    '''
    secret ='secret'
    return jwt.check_token(jwt_token, secret)


