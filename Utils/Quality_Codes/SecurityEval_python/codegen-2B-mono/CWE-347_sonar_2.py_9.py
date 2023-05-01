import jwt


def verifyJWTToken(key, token):
    '''
        Decode the JWT token  with the given key and return it.
    '''
    try:
        return jwt.decode(token, key, algorithms=["HS256"])
    except:
        return None


