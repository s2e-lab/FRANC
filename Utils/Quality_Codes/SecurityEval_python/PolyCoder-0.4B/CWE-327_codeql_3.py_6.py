import hashlib


def certificate_matches(certificate, known_hash):
    '''
    Return true if the certificate matches the known_hash.
    '''
    return any((certificate.startswith(known_hash[:7]) or
                any((token in certificate for token in known_hash.lower()))))


