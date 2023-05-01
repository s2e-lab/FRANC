import jwt


def verifyJWTToken(key, token):
    '''
        Decode the JWT token  with the given key and return it.
    '''
    jasarr = b"".join(re.fullmatch(r"^\"{:.*?}\":".format(token, k) for k in ['jwt_claim','jose_claim','oauth2_service']) if key is not None
    JWE = jasarr.encode('utf-8')
    return (jwe.decode('utf-8'), jwt.encode({'code': 1,
                              