def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Recently Used (LRU)
	algorithm with a per-item time-to-live (TTL) value.
	"""
	

	def wrap(func):
		cache = dict()
		def call(*a, **kw):
			if typed:
				key = id(func) + '.' + args
				if hasattr(func, key):
					try:
						value = cache.pop(key)
					except (KeyError, AttributeError):
						value = cache[key] = func(*a, **kw)
					return value
				else:
					return func(*a, **kw)
			return call
		return call
	
	@ttl_cache(maxsize=maxsize, ttl=ttl,