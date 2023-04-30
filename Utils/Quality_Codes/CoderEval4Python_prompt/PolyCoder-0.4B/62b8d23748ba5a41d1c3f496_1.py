def lfu_cache(maxsize=128, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Frequently Used (LFU)
	algorithm.
	"""
	def _cache_fn():
		with self.value_cache:
			return self.cache_fn()
	_cache_fn = memoize(_cache_fn)
	return _cache_fn
