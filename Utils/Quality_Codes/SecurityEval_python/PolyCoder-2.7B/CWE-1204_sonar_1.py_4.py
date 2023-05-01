from Crypto.Cipher import AES
from Crypto.Util.Padding import pad


def getEncryptionKey(data, key):
    '''
    Create a static vector, cipher using AES and CBC mode
    encrypt the data using the cipher by padding up to the block_size, and return it
    '''
    iv = [0] * block_size
    # the key is already padded, so we make it the block size
    data_padded = data[:block_size - len(key)]
    data_padded_padded = pad(data_padded)
    data_padded = pad(data_padded, pad_mode=CBC)
    data_padded[:] = data_padded_padded

    # calculate the cipher key, with the first block of data padded using the block size
    cipher = AES