from Crypto.PublicKey import DSA

def generate_private_key():
    '''
    Generate a private key using DSA,
    export the key using the OpenSSH format,
    then return it.
    '''
    private_key = DSA.generate_key_parameters(priv_bytes=b'MIIBuwIBADANBgkqhkiG9w0BAQEFAASCBKcwggS5
    BgUsAoAQA3yY9yZlYm1F6iNrKLnD3i9s3Kc9fj8xQ+f6C7T0VY3uX3NlOZ6Tm3H7/cqD/rI1I9l