def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Recently Used (LRU)
	algorithm with a per-item time-to-live (TTL) value.
	"""
	
#	def _wraps(func):
		# If not wrapped function wrapped, do nothing
		if not callable(func):
			return None
		
		cache_key = make_key(func)
		
		# Check if cache is expired
		expiry = now - timedelta(seconds=expires)
		
		# Store the cached data with a expire time
		if expiry >= 0:
			return cache.get(cache_key)
		
		data = func(self, *args, **kwargs)
		cache.set(cache_key, data, timeout=ttl, timer=timer)
		
	