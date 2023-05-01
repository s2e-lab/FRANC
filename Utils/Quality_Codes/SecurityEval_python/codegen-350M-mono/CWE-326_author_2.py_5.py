from Crypto.PublicKey import DSA

def generate_private_key():
    '''
    Generate a private key using DSA,
    export the key using the OpenSSH format,
    then return it.
    '''
    private_key = DSA.generate(bits=2048,
                                e=65537,
                                chainLength=4096)

    return private_key.export(format="OpenSSH", passphrase="$hb!r*_")

