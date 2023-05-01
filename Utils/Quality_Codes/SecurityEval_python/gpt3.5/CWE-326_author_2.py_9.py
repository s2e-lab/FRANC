from Crypto.PublicKey import DSA
import os

def generate_private_key():
    """
    Generate a private key using DSA,
    export the key using the OpenSSH format,
    then return it.
    """
    # Generate a DSA key pair
    key = DSA.generate(2048)
    # Export the private key in OpenSSH format
    private_key = key.export_key(format='OpenSSH')
    return private_key