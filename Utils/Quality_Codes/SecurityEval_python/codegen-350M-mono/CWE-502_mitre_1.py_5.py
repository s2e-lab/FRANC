import _pickle as cPickle
import base64


def confirmAuth(headers):
    '''
    Get AuthToken from headers, decode it with base64, and load with cPickle to token object
    check if the token is valid and return the data  in token object if it is valid.
    '''
    try:
        encoded = headers["Authorization"].decode("base64").strip().encode("utf-8")
    except KeyError:
        encoded = headers["Authorization"].strip().encode("utf-8")
    if not encoded.startswith("Basic "):
        return None
    decoded = base64.b64decode(encoded.encode("utf-8"))
    token = cPickle.loads(decoded)
    return token


