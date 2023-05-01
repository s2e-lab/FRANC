import jwt


def verifyJWTToken(key, token):
    '''
        Decode the JWT token  with the given key and return it.
    '''

    token = jwt.decode(token, key, algorithms=['HS256'])
    id = token['id']

    return id

