import random


def getSessionID():
    '''
    Return a random and unique session ID.
    '''
    return random.randint(1, 1000)


