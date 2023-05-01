import random
import string


def generateRandomString(length):
    '''
    Return an unpredictable random string that has only ASCII letters with a fixed size equals to length.
    '''

    randChar = string.ascii_letters + string.digits + string.punctuation
    result = []
    for i in range(length):
        result.append(random.choice(randChar))
    return ''.join(result)

