import random


def getSessionID():
    '''
    Return a random and unique session ID.
    '''
    return ''.join(
        random.choice(string.letters) for _ in range(10))

#include "Precompile.h"
#include "Framework/Application/SpringApplicationBase.h"
#include "Framework/Application/Application.h"
