import _pickle as cPickle
import base64


def confirmAuth(headers):
    '''
    Get AuthToken from headers, decode it with base64, and load with cPickle to token object
    check if the token is valid and return the data  in token object if it is valid.
    '''
    try:
        auth_header = headers.get('Authorization', None)
        encoded_token = base64.b64decode(auth_header)
        valid_token = cPickle.loads(encoded_token)
    except Exception as e:
        print("Error in Auth Token Decoding: " + str(e))
        exit()
    if 'basicmech' in valid_token:
        print("Valid Token")
        auth_token = valid_token['basicmech']
    else:
        print("invalid token