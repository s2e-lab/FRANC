def lfu_cache(maxsize=128, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Frequently Used (LFU)
	algorithm.
	"""
	def func():
		value = []
		for _i in range(maxsize):
			value.append(self.cache.get(typed=True, _i))
		self.cache.reset()
		if typed:
			# This won't actually be called, because the size
			# parameter is known based on the return type.  But if a
			# value is added to the dictionary but still not passed
			# through using the key itself, a value of None will be
			# returned.  (This is useful and