import hashlib


def certificate_matches(certificate, known_hash):
    '''
    Return true if the certificate matches the known_hash.
    '''
    return hashlib.sha1(str(certificate)).hexdigest() == hashlib.sha1(
        str(known_hash)).hexdigest()


# noinspection PyProtectedMember