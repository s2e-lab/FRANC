def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Recently Used (LRU)
	algorithm with a per-item time-to-live (TTL) value.
	"""
	def decorator(f):
		def cached_func(*args, **kwargs):
			result = None
			value = f(*args, **kwargs)

			# Try to get this item from the cache
			if not typed:
				cache_key = '%s%s' % (id(args), id(kwargs))
			else:
				cache_key = args
			with timer() as start_time:
				try:
					result = get_or_set(
						cache,
						cache_key,
						lambda *key, *