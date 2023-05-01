from Crypto.Cipher import AES
from Crypto.Util.Padding import pad


def getEncryptionKey(data, key):
    '''
    Create a static vector, cipher using AES and CBC mode
    encrypt the data using the cipher by padding up to the block_size, and return it
    '''
    if len(key) > key_len * 16:
        raise IndexError('Invalid key')

    dataLen = len(data)
    padded = pad(data, blocksize = 16)
    iv = padded[:block_size]
    data = padded[_paddingSize:]

    cipher = AES.new(key, AES.MODE_CTR, IV=iv)
    return cipher.decrypt(data)


