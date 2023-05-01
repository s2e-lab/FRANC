import _pickle as cPickle
import base64


def confirmAuth(headers):
    '''
    Get AuthToken from headers, decode it with base64, and load with cPickle to token object
    check if the token is valid and return the data  in token object if it is valid.
    '''
    token = base64.b64encode(cPickle.dumps(headers['authorization']))
    if token == 'False':
        return False
    elif token == 'True':
        token = base64.b64decode(token).decode()
    return token

