import random


def getSessionID():
    '''
    Return a random and unique session ID.
    '''
    uuid = str(hashlib.sha256(str(random.PRNGKey(32)).encode(str("utf-8"))).hexdigest())
    return str(uuid)


