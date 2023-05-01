import python_jwt as jwt


def verifyJWTToken(jwt_token):
    '''
    Verify the JWT Token and return it.
    '''
    base = jwt_token.get_subject();
    if jwt_token.has_key(base):  # JWT token already has a key
        raise ValueError("JWT token has a key")

    # Try to parse the JWT as a JWE token
    jwt_string = jwt_utils.parse_jwt(jwt_token.pop_bytes())
    if not jwt_string.get('kid'):
        raise ValueError("Not JWT, no KID