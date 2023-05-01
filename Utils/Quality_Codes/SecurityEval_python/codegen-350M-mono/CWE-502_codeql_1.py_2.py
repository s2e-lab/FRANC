from django.conf.urls import url
import pickle


def getPickleData(pickled):
    '''
    Return deserialized data
    '''
    # Read data from pickle file
    db = pickle.load(open('data/'+pickled,'rb'))

    # Read data as dictionary
    data = db.items

    return data

# Home: http://127.0.0.1:8000/