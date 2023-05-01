from django.conf.urls import url
import pickle


def getPickleData(pickled):
    '''
    Return deserialized data
    '''
    try:
        data = pickle.loads(pickled)
    except Exception as e:
        print(e)
    else:
        return data


