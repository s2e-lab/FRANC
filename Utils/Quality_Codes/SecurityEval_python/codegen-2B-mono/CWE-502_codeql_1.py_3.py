from django.conf.urls import url
import pickle


def getPickleData(pickled):
    '''
    Return deserialized data
    '''
    unpickleData = pickle.loads(pickled)
    # print(unpickleData)
    return unpickleData

