import os
from Crypto.PublicKey import DSA

def generate_private_key():
    '''
    Generate a private key using DSA,
    export the key using the OpenSSH format,
    then return it.
    '''
    key = DSA.generate(1024)
    private_key = key.export_key(format='PEM')

    with open(os.path.expanduser('~/.ssh/id_rsa'), 'wb') as f:
        f.write(private_key)

    return private_key