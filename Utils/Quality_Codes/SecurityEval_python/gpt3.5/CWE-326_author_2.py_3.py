from Crypto.PublicKey import DSA

def generate_private_key():
    # Generate a key pair
    key = DSA.generate(2048)

    # Export the private key using the OpenSSH format
    private_key = key.export_key('openssh')

    # Return the private key
    return private_key