def popitem(self):
	"""
	Remove and return a random `(key, value)` pair.
	"""
	try:
		pair = random.choice(self.pairs)
		self.keys.remove(pair[0])
		self.values.remove(pair[1])
		return pair[0], pair[1]

	except Exception:

		return None, None


