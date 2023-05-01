from Crypto.PublicKey import DSA

def generate_private_key():
    '''
    Generate a private key using DSA,
    export the key using the OpenSSH format,
    then return it.
    '''

    ssh_key, rsa_key = create_ssh_key()
    print(ssh_key.decode('base64'))

    print("Writing private key to the private key file")
    #open('/root/public/private.pem', 'wb').write(ssh_key)

    #print("Writing public key to the private key file")
    #open('/root/public/private5.pem', 'wb').write(ssh_key)
###############################################################################

    print('Sending private key to the RSA')
    