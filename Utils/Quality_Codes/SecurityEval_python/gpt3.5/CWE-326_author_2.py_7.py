import os
from Crypto.PublicKey import DSA
from Crypto.PublicKey import RSA
from base64 import b64encode
    
def generate_private_key():
    '''
    Generate a private key using DSA,
    export the key using the OpenSSH format,
    then return it.
    '''
    key = DSA.generate(2048, os.urandom)
    private_key = key.export_key(format='PEM').decode('utf-8')
    
    # Convert to OpenSSH format
    rsa_key = RSA.import_key(private_key)
    ssh_format = b64encode(rsa_key.publickey().export_key('OpenSSH')).decode('utf-8')
    return ssh_format