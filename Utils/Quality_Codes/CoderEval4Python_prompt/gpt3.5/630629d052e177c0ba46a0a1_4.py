# Importing the necessary libraries

from cryptography.hazmat.primitives import hashes, serialization
from cryptography.hazmat.primitives.asymmetric import padding
from cryptography.hazmat.backends import default_backend

def verify_relayable_signature(public_key, doc, signature):
    """
    Verify the signed XML elements to have confidence that the claimed
    author did actually generate this message.

    :param public_key: The public key of the signer
    :type public_key: bytes
    :param doc: The XML document that was signed
    :type doc: bytes
    :param signature: The signature generated for the XML document
    :type signature: bytes
    :return: Returns True if the signature is verified or False if not
    """
    pub_key = serialization.load_pem_public_key(public_key, backend=default_backend())
    signer_cert = pub_key.public_bytes(encoding=serialization.Encoding.PEM, format=serialization.PublicFormat.SubjectPublicKeyInfo)
    verifier = pub_key.verifier(signature, padding.PKCS1v15(), hashes.SHA256())
    verifier.update(signer_cert + doc)
    try:
        verifier.verify()
        return True
    except:
        return False