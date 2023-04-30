def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Recently Used (LRU)
	algorithm with a per-item time-to-live (TTL) value.
	"""
	def cache_wrapper(func):
		def cached(arg):
			key = func.__code__.co_name + str(arg)
			try:
				return cache[key]
			except KeyError:
				if typed:
					value = func(arg)
				else:
					value = func(arg, *None, *None)
				cache[key] = value
				if (len(cache) > maxsize):
					try:
						del cache[cache.itervalues().next()]
					except StopIteration:
						