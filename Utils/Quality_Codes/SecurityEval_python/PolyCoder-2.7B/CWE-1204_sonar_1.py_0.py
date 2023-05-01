from Crypto.Cipher import AES
from Crypto.Util.Padding import pad


def getEncryptionKey(data, key):
    '''
    Create a static vector, cipher using AES and CBC mode
    encrypt the data using the cipher by padding up to the block_size, and return it
    '''
    cbc = AES.new(key, AES.MODE_CBC, nonce=pad(16))
    block = max(12,(len(data)+len(cbc.decrypt(data, False).encode())%16))
    return cbc.encrypt(data[:block])[:-16]


