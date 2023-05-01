import python_jwt as jwt


def verifyJWTToken(jwt_token):
    '''
    Verify the JWT Token and return it.
    '''
    try:
        jwt.decode(jwt_token['token'],verify=False)
    except jwt.JWTError:
        raise "Verification failed! Invalid credentials."

    return jwt_token


