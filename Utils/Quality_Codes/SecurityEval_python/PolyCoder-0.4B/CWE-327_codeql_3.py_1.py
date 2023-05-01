import hashlib


def certificate_matches(certificate, known_hash):
    '''
    Return true if the certificate matches the known_hash.
    '''
    data_hash = hashlib.sha256(certificate['data'].encode('utf-8')).hexdigest()
    known_hash_len = len(known_hash)

    # The known_hash may not be the same as the certificate itself.
    if known_hash_len == data_hash.startswith(hashlib.sha256('').hexdigest()) * 2:
        cert_blob = certificate['cert_blob']
        cert_blob_len = len