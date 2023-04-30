def lfu_cache(maxsize=128, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Frequently Used (LFU)
	algorithm.
	"""
	try:
		if typed:
			return muffin(maxsize)
	except TypeError:
		# use default value
		return llfu_cache(maxsize)

@lru_cache()
