import jwt


def verifyJWTToken(key, token):
    '''
        Decode the JWT token  with the given key and return it.
    '''
    payload = jwt.decode(token, key, algorithms='RS256')
    return payload

