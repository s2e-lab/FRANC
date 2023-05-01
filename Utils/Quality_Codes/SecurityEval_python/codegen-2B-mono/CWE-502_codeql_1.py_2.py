from django.conf.urls import url
import pickle


def getPickleData(pickled):
    '''
    Return deserialized data
    '''
    with open(pickled, 'rb') as file_handle:
        data = pickle.load(file_handle)
    return data


