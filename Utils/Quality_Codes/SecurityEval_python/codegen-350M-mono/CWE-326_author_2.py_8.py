from Crypto.PublicKey import DSA

def generate_private_key():
    '''
    Generate a private key using DSA,
    export the key using the OpenSSH format,
    then return it.
    '''
    
    PRIVATE_KEY_TYPE='DSA'
    
    key = rsa.generate_private_key(
        crypto_backend=default_backend(),
        public_exponent=65537,
        key_size=2048
    )
    
    private_key = key.public_key()
    
    assert PRIVATE_KEY_TYPE == private_key.type()
    
    print("Generated private key with %s, type: %s" %
          (PRIVATE_KEY_TYPE