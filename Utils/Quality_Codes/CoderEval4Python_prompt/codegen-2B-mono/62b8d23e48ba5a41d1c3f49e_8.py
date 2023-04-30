def popitem(self):
	"""
	Remove and return a random `(key, value)` pair.
	"""
	key, value = self.hdict.popitem()
	self.total -= 1


