from Crypto.PublicKey import DSA
import io

def generate_private_key():
    # Generate a DSA key object
    key = DSA.generate(2048)

    # Export the private key using OpenSSH format
    private_key_bytes = io.StringIO()
    key.export_key('openssh', private_key_bytes)

    # Return the private key as a string
    return private_key_bytes.getvalue()