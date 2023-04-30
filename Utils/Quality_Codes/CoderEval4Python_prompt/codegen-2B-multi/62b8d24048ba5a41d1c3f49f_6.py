def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Recently Used (LRU)
	algorithm with a per-item time-to-live (TTL) value.
	"""
	cache = TimerCache(maxsize=maxsize, timer=timer, typed=typed)

	def _wrapper(func, *args, **kwargs):
		try:
			cache.cache(func, *args, **kwargs)
		except MaxSizeExceededError:
			pass
		return cache.get(_key(_cache_key(func, args, kwargs), False))

	def _key(k, typed):
		return (k[0], k[1], k[2], typed)

	def _clean():
		for