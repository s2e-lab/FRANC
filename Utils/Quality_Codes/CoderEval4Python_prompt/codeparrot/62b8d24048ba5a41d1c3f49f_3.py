def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Recently Used (LRU)
	algorithm with a per-item time-to-live (TTL) value.
	"""
	
	
	def decorate(f):
		@wraps(f)
		def _ttl_cache(*args, **kwargs):
			with LRUCache(maxsize) as lru:
				return make_ttl_cache(ttl, timer, typed) (lru.lru.ttl(maxsize))
		return _ttl_cache
	
	return decorate


