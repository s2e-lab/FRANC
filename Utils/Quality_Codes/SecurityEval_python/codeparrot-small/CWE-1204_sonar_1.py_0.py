from Crypto.Cipher import AES
from Crypto.Util.Padding import pad


def getEncryptionKey(data, key):
    '''
    Create a static vector, cipher using AES and CBC mode
    encrypt the data using the cipher by padding up to the block_size, and return it
    '''

    if key.startswith(b"AES"):
        block_size = AES.block_size
        return AES.new(data, key[len(key) + 1:], block_size)
    elif key.startswith(b"CBC"):
        block_size = CBC.block_size
        return CBC.new(data, key[len(key) + 1:], block_size)
    else:
        return data


