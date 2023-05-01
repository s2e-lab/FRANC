import jwt


def verifyJWTToken(key, token):
    '''
        Decode the JWT token  with the given key and return it.
    '''
    try:
        jwt = jwt.lib.decode(token)
        return jwt
    except Exception as e:
        raise AnsibleError("Error decoding JWT: {}".format(e))


