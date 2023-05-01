from Crypto.PublicKey import DSA

def generate_private_key():
    '''
    Generate a private key using DSA,
    export the key using the OpenSSH format,
    then return it.
    '''
    key = dsa.new(n=1, p=2, q=7), 'dummy'
    import OpenSSHIF
    OpenSSHIF.OpenSSHIF.generate_private_key(key)
    return key


