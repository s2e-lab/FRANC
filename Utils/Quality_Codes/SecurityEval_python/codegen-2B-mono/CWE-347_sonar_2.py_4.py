import jwt


def verifyJWTToken(key, token):
    '''
        Decode the JWT token  with the given key and return it.
    '''
    try:
        # Use the PyJWT to decode JWT value
        tokenJson = jwt.decode(token, key)
    except:
        # Failure  logging.error(jwt.DecodeError('Invalid token.'))
        raise jwt.DecodeError('Invalid token.')

    return tokenJson


