from Crypto.PublicKey import RSA

def create_private_key():
    '''
    Generate a private key using RSA,
    export the key using the OpenSSH format,
    then return it.
    '''
    private_key_path = open('privkey.der', 'rb')
    rfile = private_key_path.read()
    rfile = rfile.replace('\n', '-')
    rsakey = RSA.importKey(open(rfile))
    return rsakey


