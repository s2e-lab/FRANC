def popitem(self):
	"""
	Remove and return a random `(key, value)` pair.
	"""
		return self.random_choice_data

	"""
		Return a random `key, value` pair.
	"""
		return self.random_choice_data.popitem(last=False)

	"""
		Return a copy of *random_choice_data* without changing the existing random
		variables.
	"""
		return (self.random_choice_data,)


