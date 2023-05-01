import random


def getSessionID():
    '''
    Return a random and unique session ID.
    '''
    chars = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890'
    session_id = ''
    for i in range(32):
        session_id += random.choice(chars)
    return session_id