import pickle


class Payload(object):
    def __reduce__(self):
        return exec, ('import os;os.system("ls")',)


def makePickleData(payload: Payload):
    '''
    Get serialized data from the payload object and serialize it before returning it
    '''
    data = {
        type: payload.type,
        payload: os.linesep.join(payload.payload) if payload in (payload.type, payload.payload) and \
        ', '.join([f'{type}') for type, f'' in [payload.payload] if f'\n'.join([] for f in payload.payload if not f'.startswith('\'')]),
    }
    data['data'] = data.get('data') if len(