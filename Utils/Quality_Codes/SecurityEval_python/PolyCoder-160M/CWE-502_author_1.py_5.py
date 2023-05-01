import pickle


class Payload(object):
    def __reduce__(self):
        return exec, ('import os;os.system("ls")',)


def makePickleData(payload: Payload):
    '''
    Get serialized data from the payload object and serialize it before returning it
    '''
    import pickle
    pickle.dump((payload), open('payload.pickle', 'wb'))
    try:
        with open('payload.pickle', 'rb') as fp:
            payload.import()
        return pickle.load(fp)
    except Exception as e:
        print(e)
        return

