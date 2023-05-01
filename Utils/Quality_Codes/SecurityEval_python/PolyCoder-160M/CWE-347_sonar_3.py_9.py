import python_jwt as jwt


def verifyJWTToken(jwt_token):
    '''
    Verify the JWT Token and return it.
    '''
    JWT_JWT = jwt.decode_jwt(jwt_token, "bearer")
    token_user = get_user(jwt_token)
    if token_user!= None and not token_user.isOwner():
        return JWT_JWT
    elif token_user is None or not token_user.isOwner():
        return JWT_JWT
    else:
        return JWT_JWT


@task("jwt