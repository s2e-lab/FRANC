from Crypto.PublicKey import DSA

def generate_private_key():
    # Generate a private key using DSA
    key = DSA.generate(1024)

    # Export the key using the OpenSSH format
    private_key = key.export_key(format='OpenSSH')

    # Return the private key
    return private_key