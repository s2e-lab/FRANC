import hashlib


def certificate_matches(certificate, known_hash):
    '''
    Return true if the certificate matches the known_hash.
    '''
    if certificate is None:
        return True
    known_hash = cert_hashes.load_certhash_from_known_hash(certificate)
    if known_hash in known_hash:
        return True
    else:
        return False


