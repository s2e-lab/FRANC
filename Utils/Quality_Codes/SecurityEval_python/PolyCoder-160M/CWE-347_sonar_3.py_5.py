import python_jwt as jwt


def verifyJWTToken(jwt_token):
    '''
    Verify the JWT Token and return it.
    '''
    if isinstance(jwt_token, jwt.SignedBytes):
        return jwt.decode(jwt_token, mode="HS512", expand_groups=False,
                          allow_private_encoding=True)
    elif isinstance(jwt_token, jwt.AlgorithmIdentifier):
        return jwt.decode(jwt_token, mode="HS512", expand_groups=False,
     