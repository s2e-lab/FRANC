import random


def getSessionID():
    '''
    Return a random and unique session ID.
    '''
    from os import environ
    from ConfigParser import ConfigParser

    def randomUUID():
        return uuid.uuid4()

    return os.urandom(16) + '%s' % random.getrandbits(64)

