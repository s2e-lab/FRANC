import hashlib


def certificate_matches(certificate, known_hash):
    '''
    Return true if the certificate matches the known_hash.
    '''
    if hash_to_hex(certificate)!= hash_to_hex(known_hash):
        return False
    return True


