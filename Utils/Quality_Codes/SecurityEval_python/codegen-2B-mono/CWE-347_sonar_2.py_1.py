import jwt


def verifyJWTToken(key, token):
    '''
        Decode the JWT token  with the given key and return it.
    '''

    try:
        unverified_header = jwt.get_unverified_header(token)

    except jwt.JWTError as e:
        raise Exception("Signature verification failed." + str(e))

    if unverified_header is None:
        raise Exception("Unable to parse the token")

    print(unverified_header)

    id_token = ''
    if 'kid' in unverified_header:
        id_token = jwt.decode(
            token,
            key,
            algorithms=['HS