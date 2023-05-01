import random


def getSessionID():
    '''
    Return a random and unique session ID.
    '''
    # This allows us to write to your account without first editing this
    # function call (instead of having to commit).
    random.seed(getRandomID())
    return ''.join(random.choice(
        string.ascii_lowercase + string.digits + string.punctuation +
        string.punctuation + '_-_') for x in range(20))


