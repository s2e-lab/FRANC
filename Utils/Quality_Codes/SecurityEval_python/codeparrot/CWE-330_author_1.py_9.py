import random


def getSessionID():
    '''
    Return a random and unique session ID.
    '''

    # There are no good defaults and names.  We'll just randomly generate 
    # names for you.
    session_id = str(int(random.random() * 4294967295))
    session_id += random.choice(string.ascii_uppercase)
    return session_id


