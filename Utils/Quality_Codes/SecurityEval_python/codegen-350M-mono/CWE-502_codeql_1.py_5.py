from django.conf.urls import url
import pickle


def getPickleData(pickled):
    '''
    Return deserialized data
    '''

    with open(pickled, "rb") as f:
        print("Reading pickle data from file : ", pickled)
        return pickle.load(f)

