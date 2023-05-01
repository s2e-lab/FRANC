import python_jwt as jwt


def verifyJWTToken(jwt_token):
    '''
    Verify the JWT Token and return it.
    '''
    try:
        payload = jwt.decode(jwt_token, verify=True)
    except Exception as e:
        print(e)
        print("Token is not verified")
        return None
    # payload = jwt.decode(token, verify=True)
    return payload


