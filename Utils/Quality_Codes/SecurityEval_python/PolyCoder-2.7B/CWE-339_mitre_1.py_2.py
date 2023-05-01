import os
import random


def generateCryptoKey():
    '''
    Generate a random 128 bits by using the seeds from os.urandom().
    '''
    global key
    key = random.getrandbits(128)


