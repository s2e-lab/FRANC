import jwt


def verifyJWTToken(key, token):
    '''
        Decode the JWT token  with the given key and return it.
    '''
    secret = ''
    data = ''

    try:
        data = jwt.decode(token, secret)
        return data
    except Exception as e:
        raise Exception('Something went wrong. Error: {}.'.format(repr(e)))


