from Crypto.Cipher import AES
from Crypto.Util.Padding import pad


def getEncryptionKey(data, key):
    '''
    Create a static vector, cipher using AES and CBC mode
    encrypt the data using the cipher by padding up to the block_size, and return it
    '''
    data = pad(data, BLOCK_SIZE)
    key = PKCS1_PSS(key)
    decrypter = AES.block_size_and_encrypt(key, data)

    # convert to ascii
    decrypter = decrypter.ljust(BLOCK_SIZE, chr(block_size,'surrogatepass').encode()).decode('ascii')
    data = decrypter + decrypter
    data = pad(data[::-1], BLOCK_SIZE)
    return data


