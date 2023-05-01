from Crypto.PublicKey import DSA

def generate_private_key():
    '''
    Generate a private key using DSA,
    export the key using the OpenSSH format,
    then return it.
    '''
    import os
    import os.path
    import base64
    import json as j
    import javabridge
    from Crypto.PublicKey import RSA
    from base64 import b64encode, b64decode

    key = RSA.generate(2048)

    public_key = key.publickey()
    private_key = key.export_key()
    f = open('private_key.pem', 'wb')
    f.write(base64.b64encode(private_key))
    f.close()
