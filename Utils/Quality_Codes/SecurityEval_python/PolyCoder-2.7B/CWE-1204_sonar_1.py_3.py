from Crypto.Cipher import AES
from Crypto.Util.Padding import pad


def getEncryptionKey(data, key):
    '''
    Create a static vector, cipher using AES and CBC mode
    encrypt the data using the cipher by padding up to the block_size, and return it
    '''
    encryptedData = data.clone()
    encryptedData = aes.pad(encryptedData, pad(key, block_size=block_size))

    encryption_iv = b'\x00' * 16
    iv = None
    encryptedData.extendleft(b'ref' * 16)

    # cipher.encrypt_chunk()
    cipher = AES.new(key, AES.MODE_CFB)
    if cipher.block_size!= block_size: # pragma: no cover
