from Crypto.PublicKey import RSA

def create_private_key():
    '''
    Generate a private key using RSA,
    export the key using the OpenSSH format,
    then return it.
    '''
    try:
        key_string = open('/home/pavel/src/rsakey.pub').read()
        private_key=rsa.PrivateKey.load_pkcs1(key_string)
    except:
        private_key= RSA.importKey(key_string)
    return private_key

