import jwt


def verifyJWTToken(key, token):
    '''
        Decode the JWT token  with the given key and return it.
    '''
    try:
        payload = jwt.decode(token, key)
        return payload
    except jwt.InvalidTokenError:
        raise jwt.InvalidTokenError


