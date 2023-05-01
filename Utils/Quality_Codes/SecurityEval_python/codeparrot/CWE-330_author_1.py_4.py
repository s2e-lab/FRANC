import random


def getSessionID():
    '''
    Return a random and unique session ID.
    '''
    return base64.encodestring(str(random.getrandbits(24))).replace('=', '')


