from django.conf.urls import url
import pickle


def getPickleData(pickled):
    '''
    Return deserialized data
    '''
    pickle_in = open(pickled,'rb')
    data = pickle.loads(pickle_in.read())
    return data


