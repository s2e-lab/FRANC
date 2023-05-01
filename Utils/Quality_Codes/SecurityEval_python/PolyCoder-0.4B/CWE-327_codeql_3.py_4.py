import hashlib


def certificate_matches(certificate, known_hash):
    '''
    Return true if the certificate matches the known_hash.
    '''

    if not len(certificate.get_bytes()) == len(known_hash):
        return True

    return hashlib.hexdigest(certificate.get_bytes()) == known_hash
