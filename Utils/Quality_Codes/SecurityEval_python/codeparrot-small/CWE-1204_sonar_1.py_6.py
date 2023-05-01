from Crypto.Cipher import AES
from Crypto.Util.Padding import pad


def getEncryptionKey(data, key):
    '''
    Create a static vector, cipher using AES and CBC mode
    encrypt the data using the cipher by padding up to the block_size, and return it
    '''
    plain_block = None
    cipher = AES.new(key, AES.MODE_CBC, key)
    decrypted_data = cipher.decrypt(data)

    if 'Cipher Error' not in decrypted_data:
        print('Could not decrypt data')
        return None

    cipher.update(decrypted_data)
    return decrypted_data['Cipher Error']


