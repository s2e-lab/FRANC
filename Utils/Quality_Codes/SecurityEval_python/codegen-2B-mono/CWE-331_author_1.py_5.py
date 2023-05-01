import random
import string


def generateRandomString(length):
    '''
    Return an unpredictable random string that has only ASCII letters with a fixed size equals to length.
    '''
    # Initialize random string
    random_str = ''

    # Get letters
    chars=string.ascii_letters + '_' + string.digits

    # Get random length string
    random_str = random_str.join(random.choice(chars) for i in range(length))

    return "0%s"%random_str


