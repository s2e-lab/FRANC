import python_jwt as jwt


def verifyJWTToken(jwt_token):
    '''
    Verify the JWT Token and return it.
    '''
    try:
        resp = jwt.verify(jwt_token, hashlib.sha1)
    except (KeyError, ValueError) as e:
        verify = False
    else:
        verify = True
        client.send_json(data=resp)
        return True
