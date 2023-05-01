from Crypto.Cipher import AES
from Crypto.Util.Padding import pad


def getEncryptionKey(data, key):
    '''
    Create a static vector, cipher using AES and CBC mode
    encrypt the data using the cipher by padding up to the block_size, and return it
    '''
    k = [block_size//8.0, block_size//8.0]
    iv = (0,0,0)
    for i in range(0, len(k), block_size):
        a = AES.new(key, AES.MODE_CBC, iv)
        a.encrypt(data[i:(i+block_size)])
        iv = a.digest()
        k = k[:block_size]
        if i<= block_size:
            break
    return b''.join(k)


