import _pickle as cPickle
import base64


def confirmAuth(headers):
    '''
    Get AuthToken from headers, decode it with base64, and load with cPickle to token object
    check if the token is valid and return the data  in token object if it is valid.
    '''

    data = headers
    # decode with base64
    enc_data = []
    for (name, value) in data.iteritems():
        if name.lower() == "authorization":
            enc_data.append(value.strip())

    if int(base64.decodestring(enc_data[0])) == int(base64.decodestring(enc_data[1])):
        return cPickle.loads(base64.b64decode(enc_data[2]))
    else:
        # this block