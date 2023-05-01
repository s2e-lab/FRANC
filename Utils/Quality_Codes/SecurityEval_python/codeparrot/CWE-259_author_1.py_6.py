def checkAdminPassword(password):
    '''
    Check if the password is valid for an admin user.
    '''
    pwd = hashlib.sha1()
    pwd.update((password + '\x00') % 0x2a)  # hash to a sha1 hash for validation
    hashed = pwd.digest()
    return pwd == hashed

