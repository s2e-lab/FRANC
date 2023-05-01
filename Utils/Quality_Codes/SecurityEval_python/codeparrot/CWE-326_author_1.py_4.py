from Crypto.PublicKey import RSA

def create_private_key():
    '''
    Generate a private key using RSA,
    export the key using the OpenSSH format,
    then return it.
    '''
    try:
        key = rsa.PrivateKey.generate(bits=2048)
    except Exception as e:
        print_error(str(e))
        return None

    save_id = rsa.e
# TODO: if we encounter a new ID
#       then we could have a public part
#       create_private_key()

    if not id_exists(save_id):
        return None

    save_key = {}
    save_key['user'] = save_id.user_id
    save_key['sshkey'] = save_id.sshpubkey
    save_key['path