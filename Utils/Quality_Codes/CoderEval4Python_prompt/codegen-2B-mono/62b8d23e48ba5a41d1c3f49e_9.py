def popitem(self):
	"""
	Remove and return a random `(key, value)` pair.
	"""
	if not self.data:
		raise KeyError

	item = random.choice(list(self.data.items()))
	self.size -= 1
	del self.data[item[0]]
	return item
