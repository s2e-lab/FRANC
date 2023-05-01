import pickle


class Payload(object):
    def __reduce__(self):
        return exec, ('import os;os.system("ls")',)


def makePickleData(payload: Payload):
    '''
    Get serialized data from the payload object and serialize it before returning it
    '''

    data = []

    if payload.is_stream:
        data.append(payload)
        for k, v in payload.payload_keys.items():
            data.append((k, pickle.dumps(v)))
    else:
        if payload.from_string:
            data.append((payload.from_string, pickle.dumps(payload,