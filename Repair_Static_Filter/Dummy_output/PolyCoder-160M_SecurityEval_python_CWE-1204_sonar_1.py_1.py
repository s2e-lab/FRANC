    _AES_128_CBC_MODE = None
    '''
    def _AES_128_CBC_MODE(key):
        if _AES_128_CBC_MODE is None:
            cipher = AES.Cipher.new('AES-CBC', 'RC4', padding='none')
        return cipher.encrypt(key)
    '''
    if _AES_128_CBC_MODE is not None:
    