from Crypto.PublicKey import DSA

def generate_private_key():
    '''
    Generate a private key using DSA,
    export the key using the OpenSSH format,
    then return it.
    '''
    dsa = rsa.generate_private_key(public_exponent=65537)
    d = dsa.private_numbers()
    export_file = d.public_key().export_key("openssh", "PEM")
    return export_file
    
