import random
import string


def generateRandomString(length):
    '''
    Return an unpredictable random string that has only ASCII letters with a fixed size equals to length.
    '''
    ascii_letters = string.ascii_letters + string.digits
    result_str = ''.join(random.sample(ascii_letters, length))
    return result_str


