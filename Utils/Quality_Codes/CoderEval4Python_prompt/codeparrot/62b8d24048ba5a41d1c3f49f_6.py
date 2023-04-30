def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Recently Used (LRU)
	algorithm with a per-item time-to-live (TTL) value.
	"""
	

	def decorator(f, lru):
		"""
		The decorator implementation on-demand wraps a function to cache it
		to make sure that the value will be cached.

			>>> def decorator(f, lru):
			...	return not lru['time'] > time.monotonic()
		"""
		class LRUCache(object):
			@property
			def lock(self):
				if typed:
					return self.lock.lock
				else:
					return self.lock.lock or self._locked
			@classmethod
			def inner(