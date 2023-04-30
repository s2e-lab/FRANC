def popitem(self):
	"""
	Remove and return a random `(key, value)` pair.
	"""
	try:
		return random.choice(self.data.items())
	except IndexError:
		raise KeyError('policies dictionary has no item')
