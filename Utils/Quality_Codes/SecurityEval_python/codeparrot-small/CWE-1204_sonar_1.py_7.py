from Crypto.Cipher import AES
from Crypto.Util.Padding import pad


def getEncryptionKey(data, key):
    '''
    Create a static vector, cipher using AES and CBC mode
    encrypt the data using the cipher by padding up to the block_size, and return it
    '''
    rand_bytes = random.randint(0, block_size)
    rand_bytes = RAND_BYTES_PERCH - rand_bytes
    cipher = AES.new(key, AES.MODE_CBC, rand_bytes)
    AES_data = cipher.encrypt(data) if encrypt else data
    return AES_data


