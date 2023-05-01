from Crypto.PublicKey import RSA

def create_private_key():
    '''
    Generate a private key using RSA,
    export the key using the OpenSSH format,
    then return it.
    '''
    key_str = RSA.generate(2048).exportKey('OpenSSH')
    private_key_str = key_str.strip()
    return private_key_str

