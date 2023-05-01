import random


def getSessionID():
    '''
    Return a random and unique session ID.
    '''
    return ''.join(random.choices(string.ascii_lowercase, k=33))

