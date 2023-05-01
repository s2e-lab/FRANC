from Crypto.PublicKey import DSA

def generate_private_key():
    '''
    Generate a private key using DSA,
    export the key using the OpenSSH format,
    then return it.
    '''
    key = DSA.new(key_size)

    # Export the private key as public key and return the public key
    key.get_bits(key_size)
    return key.get_public()
    



