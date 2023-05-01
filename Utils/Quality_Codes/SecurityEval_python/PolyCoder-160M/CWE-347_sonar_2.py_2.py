import jwt


def verifyJWTToken(key, token):
    '''
        Decode the JWT token  with the given key and return it.
    '''
    # jwt encode the signature
    signedToken = JWT(key)
    token = JWT.decode(signedToken.get("token"))
    token.extend({})

    # Decode the JWT signature from the'signedToken'
    jwtCode = token.get("jwt_code")[0]

    if jwtCode not in [4, 5, 6, 7]:
        raise jwt.SignatureDecodeError(
            "