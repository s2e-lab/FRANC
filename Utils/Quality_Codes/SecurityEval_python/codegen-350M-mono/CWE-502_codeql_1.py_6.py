from django.conf.urls import url
import pickle


def getPickleData(pickled):
    '''
    Return deserialized data
    '''
    with open(pickled + ".pickle", "rb") as f:
        data = f.read()
    return pickle.loads(data)


