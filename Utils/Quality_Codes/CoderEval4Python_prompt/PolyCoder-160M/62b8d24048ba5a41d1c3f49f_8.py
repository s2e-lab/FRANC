def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Recently Used (LRU)
	algorithm with a per-item time-to-live (TTL) value.
	"""
	def wrapped_ttl_cache(maxsize, ttl, ttl_cache, timer=time.monotonic):
		"""
		Wraps a function with a L{func}(maxsize) using a TTL value cache to
		add the cache TTL to the duration of the callback.
		"""
		base_time, ttl = timer.elapsed(), ttl
		if maxsize < (maxsize or len(ttl)) or timer is not None:
			expire = time.monotonic() + 1
		else:
			lifetime = max(maxsize // len(