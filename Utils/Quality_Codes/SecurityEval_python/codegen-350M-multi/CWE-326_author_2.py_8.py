from Crypto.PublicKey import DSA

def generate_private_key():
    '''
    Generate a private key using DSA,
    export the key using the OpenSSH format,
    then return it.
    '''
    DSAPrivateKey = DSA.from_public_key(rand_key())
    export_key(DSAPrivateKey)
    return DSMotKey(DSAPrivateKey)

