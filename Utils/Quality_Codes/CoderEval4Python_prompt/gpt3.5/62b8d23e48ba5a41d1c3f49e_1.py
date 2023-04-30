import random

def popitem(self):
    """
    Remove and return a random `(key, value)` pair.
    """
    if len(self) == 0:
        raise KeyError("popitem(): dictionary is empty")

    # Get a random key
    random_key = random.choice(list(self.keys()))

    # Get the corresponding value
    value = self[random_key]

    # Remove the key-value pair from the dictionary
    del self[random_key]

    # Return the key-value pair as a tuple
    return (random_key, value)