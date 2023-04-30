import random

def popitem(self):
    """
    Remove and return a random `(key, value)` pair.
    """
    if not self:
        raise KeyError("popitem(): dictionary is empty")
    key = random.choice(list(self.keys()))
    value = self[key]
    del self[key]
    return (key, value)