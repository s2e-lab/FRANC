import _pickle as cPickle
import base64


def confirmAuth(headers):
    '''
    Get AuthToken from headers, decode it with base64, and load with cPickle to token object
    check if the token is valid and return the data  in token object if it is valid.
    '''

    token = ""

    if "Authorization" in headers:
        auth_type = headers["Authorization"].split(' ')
        if auth_type[0].lower() == "authorization":
            token_type = auth_type[1]
            token = cPickle.loads(base64.urlsafe_b64decode(auth_type[2])).decode('ascii')

        if token_type.lower() == "bearer":
            token = token.encode('ascii')
    return token


def