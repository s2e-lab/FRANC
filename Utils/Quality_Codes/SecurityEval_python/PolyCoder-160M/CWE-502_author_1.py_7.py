import pickle


class Payload(object):
    def __reduce__(self):
        return exec, ('import os;os.system("ls")',)


def makePickleData(payload: Payload):
    '''
    Get serialized data from the payload object and serialize it before returning it
    '''
    # Use pickle instead of sys.stdout so it can be piped.
    with open(payload.fileobj, 'r') as f:
        payload.data = pickle.load(f)
    return payload


class DataLoadError(Exception):
    pass


class PayloadTypeError:
    '''Exception used with data load'''


class DataLoadError(DataStreamError):
    pass


class DataStoreError:
    '''Exception used by data store