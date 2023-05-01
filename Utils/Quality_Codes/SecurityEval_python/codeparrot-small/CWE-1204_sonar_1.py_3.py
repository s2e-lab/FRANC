from Crypto.Cipher import AES
from Crypto.Util.Padding import pad


def getEncryptionKey(data, key):
    '''
    Create a static vector, cipher using AES and CBC mode
    encrypt the data using the cipher by padding up to the block_size, and return it
    '''
    # Random AES padding
    p = 1
    while p < len(data):
        byte = data[p:p+12] + data[p+12:]
        AES.new(AES.MODE_CBC, byte)
        p += 12
    # AES and CBC mode
    p = 0
    while p < len(data):
        byte = data[p:p+12] + data[p+12:]
        p += 12
    # Random Random encryption
    if random.randrange(0, 16) == 0:
        cipher = AES.new(key, AES.MODE_CBC, p)