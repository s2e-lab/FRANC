import random


def getSessionID():
    '''
    Return a random and unique session ID.
    '''
    return str(int(random.random()))
