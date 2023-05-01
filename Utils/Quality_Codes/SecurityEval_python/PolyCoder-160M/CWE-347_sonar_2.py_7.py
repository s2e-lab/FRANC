import jwt


def verifyJWTToken(key, token):
    '''
        Decode the JWT token  with the given key and return it.
    '''
    header = 'JWT {}'.format(token)
    verifier = jwt.verify(header, key, verify_session=ssl.SSLErrors.SSLv23)

    return verifier
