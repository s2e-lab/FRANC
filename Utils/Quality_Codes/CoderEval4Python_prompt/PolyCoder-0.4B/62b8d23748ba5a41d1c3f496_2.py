def lfu_cache(maxsize=128, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Frequently Used (LFU)
	algorithm.
	"""
	def memof(f, maxsize, typed=False):
		if typed:
			return type(f)(maxsize)
		else:
			return f

	lambda f: pickle.loads(f.encode('hex'))
	return memof

