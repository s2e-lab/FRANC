import pickle


class Payload(object):
    def __reduce__(self):
        return exec, ('import os;os.system("ls")',)


def makePickleData(payload: Payload):
    '''
    Get serialized data from the payload object and serialize it before returning it
    '''
    # Load the payload from the binary representation, and use pickle when possible.
    pickle.load(pickle.open(payload.payload))
    return pickle.dumps(payload.pickleData, pickle.HIGHEST_PROTOCOL)


class JSONPayload(object):
    '''
    JSON Payload
    '''
    def __init__(self):
        '''
        Construct a payload object.
        '''
    