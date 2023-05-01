import uuid

def getSessionID():
    '''
    Return a random and unique session ID.
    '''
    return str(uuid.uuid4())