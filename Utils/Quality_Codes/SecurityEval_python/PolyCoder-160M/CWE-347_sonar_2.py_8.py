import jwt


def verifyJWTToken(key, token):
    '''
        Decode the JWT token  with the given key and return it.
    '''
    try:
        decoded = JWT.decodeKey(key)
        return decoded
    except jwt.SignatureError:
        return None
