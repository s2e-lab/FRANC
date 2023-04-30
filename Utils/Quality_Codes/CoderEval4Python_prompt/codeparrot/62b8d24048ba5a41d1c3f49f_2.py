def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Recently Used (LRU)
	algorithm with a per-item time-to-live (TTL) value.
	"""
	

	def ttl_wrapper(value):
		"""
		Wrapper for decorating functions with a TTL.
		"""
		if isinstance(value, LeastRecentlyUsed):
			key = str(threading.current_thread().id)
			if callable(value):
				value = value(key, value) if hasattr(value, "__call__") else {}
				try:
					if typed:
						value = type(value)(value)
					else:
						value = value(key, value)
			elif isinstance(value, Counter):
				value = repr