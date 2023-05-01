import random
import string


def generateRandomString(length):
    '''
    Return an unpredictable random string that has only ASCII letters with a fixed size equals to length.
    '''
    letters = string.ascii_letters
    return ''.join(random.choice(letters) for i in range(length))


