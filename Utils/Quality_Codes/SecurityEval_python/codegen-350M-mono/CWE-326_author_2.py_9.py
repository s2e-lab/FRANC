from Crypto.PublicKey import DSA

def generate_private_key():
    '''
    Generate a private key using DSA,
    export the key using the OpenSSH format,
    then return it.
    '''
    # Generate a DSA
    d = DSA.generate(bits=384)

    # Build the keypair from it
    keypair = BIP32node.from_seed(d.public_key(encoding='der'), 'PRIVATE')
    return keypair.as_key()

