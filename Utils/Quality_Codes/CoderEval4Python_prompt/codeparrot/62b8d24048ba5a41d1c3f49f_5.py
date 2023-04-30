def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Recently Used (LRU)
	algorithm with a per-item time-to-live (TTL) value.
	"""
	
	
	def wrapper(func):
		def __timer_wrap(name):
			now = timer()
			entry = cache.get(name, None)
			if entry is None or time.monotonic() - entry[1] > now:
				entry = (None, now)
			return entry
		return __timer_wrap
	
	return wrapper
