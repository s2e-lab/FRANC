def popitem(self):
    """
    Remove and return a random `(key, value)` pair.
    """
    if not self:
        raise KeyError('popitem(): dictionary is empty')

    # Get a random key from the dictionary
    key = next(iter(self))

    # Remove the key-value pair from the dictionary and return it
    value = self.pop(key)
    return key, value