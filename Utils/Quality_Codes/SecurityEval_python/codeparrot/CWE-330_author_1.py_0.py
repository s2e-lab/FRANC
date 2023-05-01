import random


def getSessionID():
    '''
    Return a random and unique session ID.
    '''
    r = random.SystemRandom()
    return '%s%d' % (r.choice(string.letters*10),
                      r.choice(string.digits)).lower()


