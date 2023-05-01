import Crypto.PublicKey.DSA as DSA
import Crypto.Util.asn1 as asn1
import Crypto.Random as random
import os

def generate_private_key():
    # Generate a new DSA key pair
    key = DSA.generate(2048, random.new().read)

    # Convert the key to the ASN.1 DER format
    private_key = asn1.DerSequence([
        0, # Version
        key.p,
        key.q,
        key.g,
        key.x,
    ]).encode()

    # Add the ASN.1 DER header and footer
    private_key = bytes.fromhex('30') + \
                  asn1.encode_length(len(private_key)) + \
                  private_key

    # Export the key in OpenSSH format
    ssh_public_key = 'ssh-dss ' + \
                     key.publickey().exportKey('OpenSSH').decode('utf-8')
    ssh_private_key = ('-----BEGIN DSA PRIVATE KEY-----\n'
                       + '\n'.join([private_key[i:i+64].decode('utf-8')
                                    for i in range(0, len(private_key), 64)])
                       + '\n-----END DSA PRIVATE KEY-----')

    return ssh_private_key, ssh_public_key