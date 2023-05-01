from Crypto.PublicKey import DSA

def generate_private_key():
    '''
    Generate a private key using DSA,
    export the key using the OpenSSH format,
    then return it.
    '''
    dsa = DSA.generate(2048)
    pemstr = get_public_key(dsa)
    sign = sign(pemstr, dsa)
    print('Padding and sha: %s' % sign)
    
    key = binascii.a2b_hex(sign)
    return key


