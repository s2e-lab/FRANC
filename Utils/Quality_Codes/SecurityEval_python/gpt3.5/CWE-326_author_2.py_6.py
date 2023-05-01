from Crypto.PublicKey import DSA
from Crypto.PublicKey import RSA
import os

def generate_private_key():
    dsa_key = DSA.generate(2048)
    ssh_key = dsa_key.export_key('OpenSSH')
    return ssh_key.decode('utf-8')