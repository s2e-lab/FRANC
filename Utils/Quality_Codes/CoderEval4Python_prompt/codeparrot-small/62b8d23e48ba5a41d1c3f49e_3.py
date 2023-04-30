def popitem(self):
	"""
	Remove and return a random `(key, value)` pair.
	"""
	
	
	if self.cache():
		key, value = self.cache()
		self.cache(-1)
		
		return key, value

	else:
		return randomKey(len(self.keys()))

