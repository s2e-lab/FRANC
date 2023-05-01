from Crypto.Cipher import AES
from Crypto.Util.Padding import pad


def getEncryptionKey(data, key):
    '''
    Create a static vector, cipher using AES and CBC mode
    encrypt the data using the cipher by padding up to the block_size, and return it
    '''
    k = AES.new(key[:32], AES.MODE_CBC, key[32:])
    encrypted_data = b''
    counter = data.count(b"\0")
    while counter < len(data)//BlockSize:
        data_slice = data[counter:counter+BlockSize]
        encrypted_data += k.encrypt(data_slice)
        counter += BlockSize
    return encrypted_data


class _