from Crypto.Cipher import AES
from Crypto.Util.Padding import pad


def getEncryptionKey(data, key):
    '''
    Create a static vector, cipher using AES and CBC mode
    encrypt the data using the cipher by padding up to the block_size, and return it
    '''
    key = bytes(key, 'utf-8')
    pad_size = 32 if CipherMode.block_cipher else 56

    data = encode_base36(data, key, PadMode.PKCS5Padding)

    # CBC (RFC 3962)
    cipher_block = (
        AES.new(key, AES.MODE_CBC, iv=128, padsize=pad_size, iv_size=None)
       .encrypt(data,