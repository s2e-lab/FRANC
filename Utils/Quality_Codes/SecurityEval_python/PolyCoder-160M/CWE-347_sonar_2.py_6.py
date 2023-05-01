import jwt


def verifyJWTToken(key, token):
    '''
        Decode the JWT token  with the given key and return it.
    '''
    try:
        decoded_JWT_token = jwt.decode(token, None, tokenKeys=key)
    except Error:
        raise Exception(
            "JWT token must be decoded. Got error: {}".format(error=error)
        )

    return decoded_JWT_token


