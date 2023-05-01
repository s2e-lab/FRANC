import random


def getSessionID():
    '''
    Return a random and unique session ID.
    '''
    import uuid
    t = uuid.UUID(uuid.uuid4(), 16)
    rnd = str(random.randint(99,999999999))
    return (t.bytes + rnd).decode("ascii")
