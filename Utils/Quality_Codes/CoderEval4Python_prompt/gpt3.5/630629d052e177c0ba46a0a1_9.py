from Crypto.Signature import PKCS1_v1_5
from Crypto.Hash import SHA256
from Crypto.PublicKey import RSA
from base64 import b64decode

def verify_relayable_signature(public_key, doc, signature):
    # Load the public key object
    key = RSA.import_key(public_key)
    
    # Create a hash object for the document
    hash_doc = SHA256.new(doc.encode('utf-8'))
    
    # Decode the signature from base64
    signature = b64decode(signature)
    
    # Verify the signature using PKCS#1 v1.5 padding
    verifier = PKCS1_v1_5.new(key)
    return verifier.verify(hash_doc, signature)