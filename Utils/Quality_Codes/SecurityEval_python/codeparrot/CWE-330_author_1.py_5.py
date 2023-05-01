import random


def getSessionID():
    '''
    Return a random and unique session ID.
    '''
    return random.getrandbits(48)


