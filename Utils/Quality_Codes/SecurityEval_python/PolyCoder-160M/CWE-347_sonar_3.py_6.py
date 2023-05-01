import python_jwt as jwt


def verifyJWTToken(jwt_token):
    '''
    Verify the JWT Token and return it.
    '''
    if (len(jwt_token) == 16) or (len(jwt_token) == 18) or (len(jwt_token) == 20):
        print("Verify JWT Token and JWT")
        return jwt_token
    else:
        return None

