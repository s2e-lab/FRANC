from cryptography.hazmat.primitives import hashes
from cryptography.hazmat.primitives.asymmetric import padding
from cryptography.hazmat.primitives.serialization import load_pem_public_key

def verify_relayable_signature(public_key, doc, signature):
    # Load the public key from PEM format
    public_key = load_pem_public_key(public_key.encode())

    # Compute the digest of the document using SHA-256
    digest = hashes.Hash(hashes.SHA256())
    digest.update(doc.encode())
    digest_value = digest.finalize()

    # Verify the signature using PKCS1v15 padding and SHA-256 hashing
    try:
        public_key.verify(signature, digest_value,
                          padding.PKCS1v15(), hashes.SHA256())
        return True
    except Exception:
        return False