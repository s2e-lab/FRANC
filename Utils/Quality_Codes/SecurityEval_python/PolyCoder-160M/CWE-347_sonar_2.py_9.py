import jwt


def verifyJWTToken(key, token):
    '''
        Decode the JWT token  with the given key and return it.
    '''
    payload = decodeJWT()

    assert "key=" in payload

    token_body = payload["key"]

    assert "value=" in payload

    return jwt.decode(token_body, **key)
