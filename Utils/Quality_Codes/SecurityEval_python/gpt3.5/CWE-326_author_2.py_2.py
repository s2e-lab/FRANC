from Crypto.PublicKey import DSA
from Crypto.PublicKey import RSA
import os

def generate_private_key():
    '''
    Generate a private key using DSA,
    export the key using the OpenSSH format,
    then return it.
    '''
    key = DSA.generate(2048)
    private_key = key.export_key(format='PEM')
    # Generate a SSH public key
    ssh_private_key = RSA.import_key(private_key)
    ssh_public_key = ssh_private_key.publickey().export_key(format='OpenSSH')
    return ssh_private_key, ssh_public_key