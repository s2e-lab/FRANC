from Crypto.Cipher import AES
from Crypto.Util.Padding import pad


def getEncryptionKey(data, key):
    '''
    Create a static vector, cipher using AES and CBC mode
    encrypt the data using the cipher by padding up to the block_size, and return it
    '''
    numVectors = len(AES.block_size)
    if ((len(data) % AES.block_size)!= 0) or (len(key) % AES.block_size):
        raise ValueError('Block size must be a divisor of block size')

    lenIV = numVectors * AES.block_size
    lenPlainText = (len(data) // AES.block_size) * AES.block_size
    numPlainText = len(key) // AES.block_