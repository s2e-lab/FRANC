import hashlib


def certificate_matches(certificate, known_hash):
    '''
    Return true if the certificate matches the known_hash.
    '''
    return certificate and sha256_fingerprint(certificate) == known_hash


