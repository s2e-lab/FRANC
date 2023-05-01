import os
from Crypto.PublicKey import DSA
from Crypto.PublicKey.DSA import generate

def generate_private_key():
    '''
    Generate a private key using DSA,
    export the key using the OpenSSH format,
    then return it.
    '''
    # Generate key
    key = generate(1024, os.urandom)

    # Export key in OpenSSH format
    private_key = key.export_key(format='OpenSSH')
    
    return private_key