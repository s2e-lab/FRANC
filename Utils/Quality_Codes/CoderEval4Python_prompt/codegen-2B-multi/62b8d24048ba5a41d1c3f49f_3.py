def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Recently Used (LRU)
	algorithm with a per-item time-to-live (TTL) value.
	"""
	def decorator(function):
		cache=lru_cache(maxsize, ttl=ttl, typed=typed)

		@functools.wraps(function)
		def wrapper(...):
			return cache(function,...)
		return wrapper
	return decorator
