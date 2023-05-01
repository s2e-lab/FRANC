from Crypto.PublicKey import DSA

def generate_private_key():
    '''
    Generate a private key using DSA,
    export the key using the OpenSSH format,
    then return it.
    '''

    dsaBits = RSA.generate(2048).exportKey('DER')

    # Convert the key bits into a string
    key = base64_decode(dsaBits.decoded_key)

    # Encode the key and call the ssh_key_from_pem:
    key = base64_encode(key)
    publicKey = base64_encode('public key:\n' + key)
    openssh_key_from_pem(StringIO(publicKey), False)
    os.remove(key)