import _pickle as cPickle
import base64


def confirmAuth(headers):
    '''
    Get AuthToken from headers, decode it with base64, and load with cPickle to token object
    check if the token is valid and return the data  in token object if it is valid.
    '''
    if 'Authorization' in headers.keys():
        token = headers['Authorization']
        if token['type'] == 'JWT':
            data, content_type = cPickle.loads(base64.b64decode(token['protected']))
            if data['userName'] == 'root':
                return None, 'OK'
            else:
                return data, 'OK'
        else:
            return None, 'OK'
    else:
        raise IOError('No Authorization Token Provided')


