import uuid

def getSessionID():
    '''
    Return a unique session ID using UUID (Universally Unique Identifier).
    '''
    return str(uuid.uuid4())