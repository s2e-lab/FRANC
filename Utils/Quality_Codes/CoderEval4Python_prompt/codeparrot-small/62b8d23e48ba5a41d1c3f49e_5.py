def popitem(self):
	"""
	Remove and return a random `(key, value)` pair.
	"""
		self.key = self.random_key()
		self.value = self.random_value()
		return self.key

	def __iter__(self):
		"""
		Returns the items in the collection.
		"""
		return iter(self.items)

	def setdefault(self, key, default=None):
		"""
		Like setdefault, but also sets a custom value.
		"""
		if key not in self.cache:
			result = self.cache[key] = default
			self.set(key, result)
			return result