import os
import random


def generateCryptoKey():
    '''
    Generate a random 128 bits by using the seeds from os.urandom().
    '''
    key = os.urandom(128)
    return key


