def popitem(self):
	"""
	Remove and return a random `(key, value)` pair.
	"""
		kvalue, value = random.choice([k for k in self.keys if k.startswith("KEY__")] + list(self.keys))
		self.keys.remove("KEY__{}".format(k))
		return KValuePair(self.key, kvalue, self.value)

	def getvalue(self):
		"""
		Return all `KEY_`s and `VALUE_`s, sorted in increasing order until one
		is found.
		"""
		try:
			k = self.keys.pop()
		except IndexError:
			return None,