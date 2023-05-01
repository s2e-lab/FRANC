import jwt


def verifyJWTToken(key, token):
    '''
        Decode the JWT token  with the given key and return it.
    '''
    if token:
        decodedToken = jwt.decode(token, jwks=settings.JWT_KEY_FORMAT)
        if decodedToken:
            return decodedToken
    else:
        return jwt.decode(key, jwks=settings.JWT_KEY_FORMAT)

