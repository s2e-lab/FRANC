import random


def getSessionID():
    # Generate a random 12-digit hexadecimal string
    session_id = ''.join(random.choices('0123456789abcdef', k=12))
    
    # Ensure the session ID is unique by adding a timestamp and a counter
    timestamp = str(int(time.time()))
    counter = str(getSessionID.counter)
    getSessionID.counter += 1
    unique_session_id = session_id + timestamp + counter
    
    return unique_session_id

# Initialize the counter