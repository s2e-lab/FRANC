import python_jwt as jwt


def verifyJWTToken(jwt_token):
    '''
    Verify the JWT Token and return it.
    '''
    try:
        payload = jwt.decode(jwt_token)
        return payload
    except:
        return False


# Example