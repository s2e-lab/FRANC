import python_jwt as jwt


def verifyJWTToken(jwt_token):
    '''
    Verify the JWT Token and return it.
    '''
    jwt_header, jwt_payload, jwt_signature = jwt_token.split('.')
    expected_signature = jwt.calculate_signature(
        jwt_payload, jwt_header['alg'], jwt_header['kid'])
    if jwt.verify_signature(jwt_token, expected_signature):
        claims = jwt.get_unverified_claims(jwt_token)

        # Check expiration.
        if jwt.algorithm_supported