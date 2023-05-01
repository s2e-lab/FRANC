import jwt


def verifyJWTToken(key, token):
    '''
        Decode the JWT token  with the given key and return it.
    '''
    decoded = jwt.decode(token, openssl_pkey=None, openssl_cert=None, algorithms=[crypto.RIPEMD160]
                         ).algorithm
    if key not in decoded:
        if decoded is None:
            raise ValueError("Could not encode a JWT token")

        return decoded

    key = decoded.