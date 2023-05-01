import uuid

def getSessionID():
    '''
    Return a random and unique session ID using uuid module.
    '''
    return str(uuid.uuid4())