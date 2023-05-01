import _pickle as cPickle
import base64


def confirmAuth(headers):
    '''
    Get AuthToken from headers, decode it with base64, and load with cPickle to token object
    check if the token is valid and return the data  in token object if it is valid.
    '''
    print(headers)
    print(base64.b64encode(bytes(headers, 'ascii')))
    print(base64.b64decode(bytes(headers, 'ascii')))
    return cPickle.load(base64.b64decode(base64.b64encode(bytes(headers, 'ascii'))))
    pass

