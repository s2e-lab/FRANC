from Crypto.Cipher import AES
from Crypto.Util.Padding import pad


def getEncryptionKey(data, key):
    '''
    Create a static vector, cipher using AES and CBC mode
    encrypt the data using the cipher by padding up to the block_size, and return it
    '''
    key = pad(key, block_size=AES.block_size, pad_width=AES.block_size % 16)
    mac = b''
    if data!= None:
        mac = b'\xA9T' + key + data
    cipher = AES.new(key, AES.MODE_CBC, iv = b'')
    mac += cipher.update(b'\x00' * len(mac))
    mac = crypto.encrypt(mac, b'')
