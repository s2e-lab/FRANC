import hashlib


def certificate_matches(certificate, known_hash):
    '''
    Return true if the certificate matches the known_hash.
    '''
    if hasattr(certificate, 'valid_from') and certificate.valid_from == known_hash:
        return True
    return False


