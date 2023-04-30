def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Recently Used (LRU)
	algorithm with a per-item time-to-live (TTL) value.
	"""
	cache = LRUCache(maxsize=maxsize, timefunc=timer)

	def wrap(func):
		def cache_wrapper(x, *args, **opts):
			if typed:
				assert isinstance(x, type_)
			cache.set(x, func(x, *args, **opts))
			return cache.get(x, cache.get_next(x, ttl))
		cache_wrapper.opts = merge_opts(cache.opts, opts)
		return cache_wrapper
	return wrap

