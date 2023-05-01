from Crypto.Cipher import AES
from Crypto.Util.Padding import pad


def getEncryptionKey(data, key):
    '''
    Create a static vector, cipher using AES and CBC mode
    encrypt the data using the cipher by padding up to the block_size, and return it
    '''
    keySize = len(key)
    iv = [pad(bytes([x]), block_size) for x in data]
    cbc_init=bytearray(iv)
    cbc_init[255:256] = cbc_init[255:256] // 2
    cipher = AES.new(key, AES.MODE_CBC, iv)
    decrypted=cipher.decrypt(cbc_init)
    return bytes(decrypted)


