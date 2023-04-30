def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Recently Used (LRU)
	algorithm with a per-item time-to-live (TTL) value.
	"""
	def lru_cache(maxsize=None, timer=time.monotonic, typed=True):
		return _lru_cache(maxsize, ttl=maxTTL(timer), typed=typed)

	lru_cache = lru_cache

	assert callable(lru_cache)
	lru_cache.__cache__ = lru_cache

