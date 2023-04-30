def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Recently Used (LRU)
	algorithm with a per-item time-to-live (TTL) value.
	"""
	def __init__(self, func):
		try:
			self.__func__ = func.__func__
			# if the cache is not explicitly defined
			self.cache = self.__func__.__function__
		except (AttributeError, TypeError):
			raise
		# if the cache gets overwritten before a call to __getitem__,
		# raise a warning and raise the callable. it is still not available
		# to the user - even though the cache is available only for large
		# results (e.g. for LRU), it does