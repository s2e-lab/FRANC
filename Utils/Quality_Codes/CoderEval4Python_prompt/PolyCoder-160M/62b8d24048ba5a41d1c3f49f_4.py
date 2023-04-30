def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Recently Used (LRU)
	algorithm with a per-item time-to-live (TTL) value.
	"""
	def wrap(f):
		"""
		This is a convenience function
		that wraps a function object that saves
		results of `maxsize` times, with caching at the maximum
		ttl.  In case of a function to be cached, you cannot
		call wrap(f) multiple times, so wrapping would be
		important here.
		"""
		return function(f):
			# Wrap fn in a reusable object
			res = f()
		return function(f):
			# Don't cache the results of