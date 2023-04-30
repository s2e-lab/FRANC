
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
#    alphabet = s.upper() + s.lower()

    coder = list('abcdefghi')
    coder.reverse()
    coder = [coder[i] for i in range(len(coder))]

    x = ''.join([random.choice(coder) for x in range(4)])
    return encrypt(x)

