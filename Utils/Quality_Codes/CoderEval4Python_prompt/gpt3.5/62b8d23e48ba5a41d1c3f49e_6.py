def popitem(self):
    """
    Remove and return a random `(key, value)` pair.
    """
    if not self:
        raise KeyError('dictionary is empty')
    key, _ = self._table.popitem()
    value = self._data.pop(key)
    return key, value