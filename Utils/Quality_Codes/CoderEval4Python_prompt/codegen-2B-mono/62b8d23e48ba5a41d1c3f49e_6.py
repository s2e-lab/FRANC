def popitem(self):
	"""
	Remove and return a random `(key, value)` pair.
	"""
	keys = list(self._data)
	value = random.choice(self._data.values())
	del self._data[keys[value.key]]
	return (keys[value.key], value.data)

