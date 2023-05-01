import os
import random


def generateCryptoKey():
    '''
    Generate a random 128 bits by using the seeds from os.urandom().
    '''
    assert os.name == 'posix'
    random.seed(os.urandom())
    assert len(os.urandom(0)) == 128

