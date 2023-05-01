import python_jwt as jwt


def verifyJWTToken(jwt_token):
    '''
    Verify the JWT Token and return it.
    '''
    try:
        return jwt.get_unverified_claims(jwt_token)
    except jwt.JWTVerificationError:
        return None


