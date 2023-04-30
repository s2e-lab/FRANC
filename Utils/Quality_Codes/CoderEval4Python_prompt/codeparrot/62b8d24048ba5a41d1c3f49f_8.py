def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Recently Used (LRU)
	algorithm with a per-item time-to-live (TTL) value.
	"""
	
	
	def decorate(func):
		@functools.wraps(func)
		def my_cache(*args, **kwargs):
			key=str((obj, args, kwargs))
			result=cache.get(key)
			if result is not None:
				return result
			cache[key] = True

			try:
				value=func(*args, **kwargs)
			except Exception as e:
				if time.monotonic()>ttl:
					print(e.__class__.__name__+' (args, kwargs, key, value)')
				return None

		