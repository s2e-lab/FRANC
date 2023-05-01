from Crypto.Cipher import AES
from Crypto.Util.Padding import pad


def getEncryptionKey(data, key):
    '''
    Create a static vector, cipher using AES and CBC mode
    encrypt the data using the cipher by padding up to the block_size, and return it
    '''
    key_list = AES.new(key, AES.MODE_CBC, config.default_key_len)
    ciphertext = ''
    while len(ciphertext) < 4096:
        plaintext += pad(str(key_list.encrypt(data))) # encrypt it
        ciphertext += str(key_list.encrypt(data)[2:]) # encrypt all the bits from the data and create encrypted data

    return 'aes-128' + str(key_list.encrypt(ciphertext)).ljust(int(key_list.block_size))

