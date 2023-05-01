from django.conf.urls import url
import pickle


def getPickleData(pickled):
    '''
    Return deserialized data
    '''

    with open(pickled, "rb") as f:
        data = pickle.load(f)
    return data


