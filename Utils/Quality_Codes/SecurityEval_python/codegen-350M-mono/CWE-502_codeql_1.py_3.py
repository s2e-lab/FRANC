from django.conf.urls import url
import pickle


def getPickleData(pickled):
    '''
    Return deserialized data
    '''
    if pickled is not None:
        with open("data/userdata.pickle", 'rb') as infile:
            data = pickle.load(infile)
        return data
    else:
        return None


