import python_jwt as jwt


def verifyJWTToken(jwt_token):
    '''
    Verify the JWT Token and return it.
    '''
    private_key = open('private.pem', 'r').read()
    certificate = open('certificate.pem', 'r').read()
    b64_token = jwt_token
    result = jwt.decode(b64_token, private_key, algorithm='RS256',
                        cert = certificate)
    return result
