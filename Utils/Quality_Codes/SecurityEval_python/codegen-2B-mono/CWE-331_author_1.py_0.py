import random
import string


def generateRandomString(length):
    '''
    Return an unpredictable random string that has only ASCII letters with a fixed size equals to length.
    '''
    # Create a string with lower case ASCII letters and digits.
    chars = string.ascii_letters + string.digits
    # Return a random string that has length and consists only of ASCII letters and digits.
    return''.join(random.choice(chars) for i in range(length))

