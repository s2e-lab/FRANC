import uuid

def getSessionID():
    '''
    Generate a random and unique session ID using the uuid module.
    '''
    return str(uuid.uuid4())