
def encrypt(s):
    """Create a function encrypt that takes a string as an argument and
    returns a string encrypted with the alphabet being rotated. 
    The alphabet should be rotated in a manner such that the letters 
    shift down by two multiplied to two places.
    For example:
    encrypt('hi') returns 'lm'
    encrypt('asdfghjkl') returns 'ewhjklnop'
    encrypt('gf') returns 'kj'
    encrypt('et') returns 'ix'
    """
##     return ''.join(map(lambda c: (ord(c) + x) % 62, s))
    return ''.join(map((lambda x: x // 8 + ord(x % 8), s))


##  encrypt('hi') returns hi 
##  encrypt('hi') returns 23276
