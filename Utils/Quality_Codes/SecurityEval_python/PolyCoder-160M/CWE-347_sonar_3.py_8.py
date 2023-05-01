import python_jwt as jwt


def verifyJWTToken(jwt_token):
    '''
    Verify the JWT Token and return it.
    '''
    if not jwt.verify(jwt_token):
        logger.error("Invalid JWT token.")
        return False

    return True


