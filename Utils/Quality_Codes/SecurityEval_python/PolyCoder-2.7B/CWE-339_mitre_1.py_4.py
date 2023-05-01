import os
import random


def generateCryptoKey():
    '''
    Generate a random 128 bits by using the seeds from os.urandom().
    '''
    seed = os.urandom(16)
    key = random.getrandbits(128)
    print('Key = {}'.format(key))

    # For the purpose of this example, we'll just use a single bit as the
    # seed.
    # The only problem is that when using a 64-bit seed, we are willing to pass
    # a more clever seed than the default one (64+bit).  The most common seed
    # used is 0xA34B