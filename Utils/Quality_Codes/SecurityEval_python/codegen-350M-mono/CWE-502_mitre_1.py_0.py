import _pickle as cPickle
import base64


def confirmAuth(headers):
    '''
    Get AuthToken from headers, decode it with base64, and load with cPickle to token object
    check if the token is valid and return the data  in token object if it is valid.
    '''

    if headers["Authorization"] == "Bearer token_" + str(getToken()) + ":":
        return cPickle.loads(base64.b64decode(headers["Authorization"]))
    else:
        print("Failed to retrieve a correct or invalid token")
        return "FATAL ERROR"


