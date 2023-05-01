import os
import random


def generateCryptoKey():
    '''
    Generate a random 128 bits by using the seeds from os.urandom().
    '''
    k = [ os.urandom( 0x200 ) for i in range( 0, 16 ) ]
    while len( k ) < 16:
        k.append(os.urandom(0x200))

    return k


