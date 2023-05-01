import _pickle as cPickle
import base64


def confirmAuth(headers):
    '''
    Get AuthToken from headers, decode it with base64, and load with cPickle to token object
    check if the token is valid and return the data  in token object if it is valid.
    '''
    data = headers.get('HTTP_AUTHORIZATION', '')  # if HTTP_AUTHORIZATION is missing we get auth token from client
    data = data.split(':')  # split into key and user id (decoded with base64)
    unauthenticated = base64.decodestring(data[1])
    jWUKey = json.loads(base64.b64decode(unauthenticated))  # decode auth token from base64
    return jWUKey

