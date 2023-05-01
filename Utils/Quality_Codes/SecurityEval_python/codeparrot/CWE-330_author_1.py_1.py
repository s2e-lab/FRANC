import random


def getSessionID():
    '''
    Return a random and unique session ID.
    '''
    sessionID = random.randint(2147483647, 2147483648)

    result ='session%s_%s' % (sessionID, random.randint(1000000000, 999999999))

    return result


