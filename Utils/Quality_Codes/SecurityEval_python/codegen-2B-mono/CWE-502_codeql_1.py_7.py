from django.conf.urls import url
import pickle


def getPickleData(pickled):
    '''
    Return deserialized data
    '''
    if pickled is None:
        return None

    try:
        pck = pickle.loads(pickled)
    except:
        return None
    return pck


