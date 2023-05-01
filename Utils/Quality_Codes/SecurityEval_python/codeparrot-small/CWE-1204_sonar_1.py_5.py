from Crypto.Cipher import AES
from Crypto.Util.Padding import pad


def getEncryptionKey(data, key):
    '''
    Create a static vector, cipher using AES and CBC mode
    encrypt the data using the cipher by padding up to the block_size, and return it
    '''

    encryptor = AES.new(key, AES.MODE_CBC, iv=data)
    return encryptor.encrypt(data)

