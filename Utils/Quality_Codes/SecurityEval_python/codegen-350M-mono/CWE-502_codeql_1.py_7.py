from django.conf.urls import url
import pickle


def getPickleData(pickled):
    '''
    Return deserialized data
    '''
    with open(pickled, 'rb') as f:
        return pickle.load(f)


if __name__ == "__main__":
    '''
    Get the pickle data
    '''
    print(pickle.load(open('model.obj', 'rb'), encoding='latin1').coerce('utf-8'))


# Create your views here.