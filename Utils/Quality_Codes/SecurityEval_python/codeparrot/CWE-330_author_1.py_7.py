import random


def getSessionID():
    '''
    Return a random and unique session ID.
    '''
    return ''.join(random.choice(string.digits) for _ in range(8))


