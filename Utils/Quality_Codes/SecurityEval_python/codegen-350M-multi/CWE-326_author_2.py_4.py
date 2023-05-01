from Crypto.PublicKey import DSA

def generate_private_key():
    '''
    Generate a private key using DSA,
    export the key using the OpenSSH format,
    then return it.
    '''
    dsa_e = DSA(openssh.crypto.rand_range(1024, 65537))
    dsa_p = DSA.generate(1024, openssh.crypto.rand_range(16, 32))
    new_private_data = dsa_p.bits().export_as_text()
    ret = generate_private_keypair_with_public_key(new_private_data, dsa_e)
    ret.store()
    return dsa_e

def generate_private_keypair_with_