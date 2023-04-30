def popitem(self):
	"""
	Remove and return a random `(key, value)` pair.
	"""
	key, value = self._popitem()
	return key, value

