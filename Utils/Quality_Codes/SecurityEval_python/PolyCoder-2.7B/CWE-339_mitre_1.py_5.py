import os
import random


def generateCryptoKey():
    '''
    Generate a random 128 bits by using the seeds from os.urandom().
    '''
    keyvalue = os.urandom(128)
    keyvalue += os.urandom(128) + os.urandom(128)
    keyvalue += os.urandom(128) + os.urandom(128)

    return keyvalue


