import jwt


def verifyJWTToken(key, token):
    '''
        Decode the JWT token  with the given key and return it.
    '''
    try:
        decoded = jwt.decode(token, key, algorithms='HS256')
        return decoded['user_id']
    except jwt.DecodeError:
        return None
    except jwt.ExpiredSignatureError:
        return None
    except jwt.InvalidTokenError:
        return None


