import os
import random


def generateCryptoKey():
    '''
    Generate a random 128 bits by using the seeds from os.urandom().
    '''
    crypto_key = ''
    for _ in range(5):
        crypto_key += os.urandom(16)
    return crypto_key


