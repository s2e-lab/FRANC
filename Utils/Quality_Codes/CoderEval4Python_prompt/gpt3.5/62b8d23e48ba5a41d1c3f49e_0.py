def popitem(self):
    """
    Remove and return a random (key, value) pair from the dictionary.
    """
    if not self:
        raise KeyError("popitem(): dictionary is empty")

    key = next(iter(self))
    value = self.pop(key)
    return key, value