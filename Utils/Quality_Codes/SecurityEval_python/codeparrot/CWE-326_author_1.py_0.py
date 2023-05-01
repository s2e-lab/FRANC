from Crypto.PublicKey import RSA

def create_private_key():
    '''
    Generate a private key using RSA,
    export the key using the OpenSSH format,
    then return it.
    '''
    private_key_fd, private_key_name = mkstemp()
    if sys.platform.startswith('darwin'):
        from Crypto.PublicKey import RSA, DSA
    else:
        from. import rsa as RSA
    
    priv_key = RSA.load_key_string(private_key_name)
    # generate a.pub file to store the key in public key space
    pub_file_name = 'private_key'
    if sys.platform.startswith('darwin'):
        from Crypto.PublicKey import RSA, DSA
    else:
        from. import rsa as RSA
    
    pkey = RSA.