import pickle


class Payload(object):
    def __reduce__(self):
        return exec, ('import os;os.system("ls")',)


def makePickleData(payload: Payload):
    '''
    Get serialized data from the payload object and serialize it before returning it
    '''
    if payload is None:
        return None

    for k, v in payload.items():
        if k in sys.meta and v is sys.meta[k]:
            continue

        data = data.copy()
        data['data'] = [] if isinstance(v, bytes) else v
        data['data'].append(payload.get(k))
