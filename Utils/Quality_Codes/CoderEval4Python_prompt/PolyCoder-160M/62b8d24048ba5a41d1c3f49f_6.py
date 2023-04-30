def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Recently Used (LRU)
	algorithm with a per-item time-to-live (TTL) value.
	"""
	# The decorator always uses a cached function, so caching is not reliable
	# as it will automatically save the results in the default
	# implementation.

	# Forces a reentrant cached function to return the current cached
	# value.
	def rmt_cache(func):
		# Note: the returned function cannot be run anytime after having
		# the same value, so the current cache value stored is usually
		# different.  It may cause a cache miss if the return value of the
		# previous cached function is `None`.
		