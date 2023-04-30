def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Recently Used (LRU)
	algorithm with a per-item time-to-live (TTL) value.
	"""
	cache = None

	@wraps(func)
	def dec(self):
		try:
			return cache.get(self, maxsize=maxsize)
		except AttributeError:
			cache = self.LRUCache(maxsize=maxsize, ttl=ttl, typed=typed, timer=timer)

		value = cache.get(self, maxsize=maxsize)
		if value is not None:
			return value

		value = func(self)

		if typed:
			value = cache.put(self, value)