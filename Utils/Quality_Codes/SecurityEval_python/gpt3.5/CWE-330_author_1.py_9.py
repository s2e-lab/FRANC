import uuid

def getSessionID():
    '''
    Return a random and unique session ID.
    '''
    session_id = uuid.uuid4()
    return str(session_id)