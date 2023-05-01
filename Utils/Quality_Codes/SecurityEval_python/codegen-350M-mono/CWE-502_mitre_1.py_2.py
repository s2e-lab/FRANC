import _pickle as cPickle
import base64


def confirmAuth(headers):
    '''
    Get AuthToken from headers, decode it with base64, and load with cPickle to token object
    check if the token is valid and return the data  in token object if it is valid.
    '''

    data = None
    if 'Authorization' in headers:
        auth_token = headers['Authorization']
        auth_token = base64.b64decode(auth_token.strip().strip('$2b$')).decode()
        if auth_token['success'] == 'true':
            if 'data' in auth_token['data'][0]:
                data = cPickle.loads(auth_token['data'][0]['data'])
        else:
            return 'auth_token_invalid'
    else: