import random


def getSessionID():
    '''
    Return a random and unique session ID.
    '''
    import random
    return ''.join(random.choice(string.digits+string.hexdigits) for x in xrange(32))


