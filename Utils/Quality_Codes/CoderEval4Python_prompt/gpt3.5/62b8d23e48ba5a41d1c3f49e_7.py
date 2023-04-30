import random

def popitem(self):
    """
    Remove and return a random `(key, value)` pair.
    """
    if len(self) == 0:
        raise KeyError('dictionary is empty')
    key = random.choice(list(self.keys()))    # choose random key from keys of dictionary
    value = self.pop(key)    # remove key-value pair from dictionary and return value
    return (key, value)