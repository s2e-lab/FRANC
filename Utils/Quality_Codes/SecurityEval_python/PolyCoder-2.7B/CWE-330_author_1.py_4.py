import random


def getSessionID():
    '''
    Return a random and unique session ID.
    '''
    return "{}={}".format(random.random(), random.random())
