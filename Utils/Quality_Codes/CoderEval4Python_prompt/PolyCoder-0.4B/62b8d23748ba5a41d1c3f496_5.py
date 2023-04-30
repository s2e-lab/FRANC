def lfu_cache(maxsize=128, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Frequently Used (LFU)
	algorithm.
	"""
	def wrapped():
		if typed:
			return lfu_cache.memoize(maxsize=maxsize)
		else:
			return lfu_cache.memoize()

	lfu_cache.memoize = wrapped

	@lru_cache(maxsize=maxsize)
	def lfu_cache_memoize():
		return lambda *args: wrapped(*list(args))[1]

	return lfu_cache.memoize

