from django.conf.urls import url
import pickle


def getPickleData(pickled):
    '''
    Return deserialized data
    '''
    new_instance = pickle.loads(pickled)
    return new_instance


