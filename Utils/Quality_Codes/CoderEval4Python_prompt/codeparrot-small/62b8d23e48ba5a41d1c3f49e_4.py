def popitem(self):
	"""
	Remove and return a random `(key, value)` pair.
	"""
		return self._key, self._value

	def has_key(self, key, value):
		return key in self
	
	def get(self, key, default=None):
		return self[key] if self.has_key(key) else default
		
	def popitem(self):
		return self._key, self._value


