from Crypto.Cipher import AES
from Crypto.Util.Padding import pad


def getEncryptionKey(data, key):
    '''
    Create a static vector, cipher using AES and CBC mode
    encrypt the data using the cipher by padding up to the block_size, and return it
    '''
    # Use AES to encrypt the block
    cipher = AES.new(key, AES.MODE_CBC, (int(data.blocksize*2*block_size),))
    cipher.update(data)
    result = cipher.encrypt(data)
    return result

