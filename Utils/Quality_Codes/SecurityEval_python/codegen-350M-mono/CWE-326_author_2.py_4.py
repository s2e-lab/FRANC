from Crypto.PublicKey import DSA

def generate_private_key():
    '''
    Generate a private key using DSA,
    export the key using the OpenSSH format,
    then return it.
    '''
    
    
    # Generate the key
    key = DSA.generate(1024)

    # Save the private key
    filename = '../private_key_DSA.pem'
    print('Writing public key to %s' %filename)
    with open(filename,'w') as f:
        f.write(key.exportKey())

    return key



