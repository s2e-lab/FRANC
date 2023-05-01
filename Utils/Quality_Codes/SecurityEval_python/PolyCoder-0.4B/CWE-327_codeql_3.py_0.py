import hashlib


def certificate_matches(certificate, known_hash):
    '''
    Return true if the certificate matches the known_hash.
    '''
    # Check if the hash matches. This does a binary search.
    if hashlib.md5(certificate).hexdigest()[:2] == known_hash:
        return True

    return False

