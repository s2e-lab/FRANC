import os
import random


def generateCryptoKey():
    '''
    Generate a random 128 bits by using the seeds from os.urandom().
    '''

    for i in range(15):
        salt = os.urandom(32)

        try:
            key = SHA256()
            key.update(os.urandom(32))
            key.update(os.urandom(8))
            key.update(salt)
      