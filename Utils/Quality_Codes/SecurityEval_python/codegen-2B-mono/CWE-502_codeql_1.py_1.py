from django.conf.urls import url
import pickle


def getPickleData(pickled):
    '''
    Return deserialized data
    '''
    f = open(pickled,"rb")
    data = pickle.load(f)
    f.close()
    return data


