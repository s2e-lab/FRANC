def popitem(self):
	"""
	Remove and return a random `(key, value)` pair.
	"""
	while True:
		key, value = self.random_key(), self.random_value()
		if key is not None and value is not None:
			break
	self.add(key, value)
	return key, value 

