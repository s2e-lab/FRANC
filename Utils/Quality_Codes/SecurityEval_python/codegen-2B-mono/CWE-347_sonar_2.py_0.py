import jwt


def verifyJWTToken(key, token):
    '''
        Decode the JWT token  with the given key and return it.
    '''
    try:
        data = jwt.decode(token,key)
        decoded = True
        return data
    except:
        decoded = False
    return False


