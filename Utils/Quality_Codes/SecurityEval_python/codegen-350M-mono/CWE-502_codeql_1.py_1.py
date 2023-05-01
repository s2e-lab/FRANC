from django.conf.urls import url
import pickle


def getPickleData(pickled):
    '''
    Return deserialized data
    '''
    try:
        return pickle.loads(pickled)
    except ValueError as exc:
        print("Error:", exc)
        raise InvalidPickle("Error: {}".format(exc))




