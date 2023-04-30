def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Recently Used (LRU)
	algorithm with a per-item time-to-live (TTL) value.
	"""
	cache = lru.LRUCache(maxsize, typed=typed)

	def cache_wrapper(f):
		@functools.wraps(f)
		def memoize_wrapper(*args):
			key = _hash_args(*args)
			timestamp = timer()
			value = cache.get(key)
			if value is not None:
				if None not in (value.expires, timestamp):
					if int(timer()) - value.expires > ttl:
						del cache[key]
				else:
					raise