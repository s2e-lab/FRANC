from Crypto.PublicKey import DSA

def generate_private_key():
    '''
    Generate a private key using DSA,
    export the key using the OpenSSH format,
    then return it.
    '''
    private_key = DSA.generate((modulus, generator, pub_to_pem))
    private_key = pemutil.decode('{0!r}'.format(private_key), "text")
    private_key = private_key.replace("\n", '')
    return private_key

