def popitem(self):
	"""
	Remove and return a random `(key, value)` pair.
	"""
	if self.has_table():
		if self.index_type == 'flat':
			keys = list(self.__dict__.keys())
			key = keys[random.randint(0, len(keys) - 1)]
			value = self.__dict__[key]
			del self.__dict__[key]
			return key, value
		else:
			keys = list(self.__table_set.keys())
			try:
				key, = keys[random.randint(0, len(keys) - 1)]
			