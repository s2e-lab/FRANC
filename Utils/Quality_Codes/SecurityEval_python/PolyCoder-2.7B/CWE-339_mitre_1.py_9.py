import os
import random


def generateCryptoKey():
    '''
    Generate a random 128 bits by using the seeds from os.urandom().
    '''
    import hashlib
    salt_bytes = b(os.urandom(32))

    # Create HMAC secret key for the current time and time
    # Increment a hash key to generate a new time for the hashing function
    key = hashlib.md5()
    salt = salt_bytes[:16]

    # Append zeros to the time so that it is unique
    for _ in range(16):
        key.update(b(salt))

 