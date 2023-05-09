from Crypto.Cipher import AES
from Crypto.Util.Padding import pad


def getEncryptionKey(data, key):
    '''
    Create a static vector, cipher using AES and CBC mode
    encrypt the data using the cipher by padding up to the block_size, and return it
    '''# Fix : Fixed incorrect padding algorithm. Check that key length is consistent.
# Fixed Code2 : Fixed bad input. If input is wrong then check that the length of the input is correct. Throw error if the input is not correct (like invalid input if len(_) is not equal to block_size)

# Fixed Code3 : Fixed incorrect length of "ciphertext".
# Fixed Code4 : Changed it to a function that takes 2 or 4 bytes in length.

# Fixed Code5 : Fixed incorrect padding algorithm
# Fixed Code6 : Fixed incorrect input length.

# Fixed Code7 : Fixed