def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Recently Used (LRU)
	algorithm with a per-item time-to-live (TTL) value.
	"""
	class __Cache(AbstractCache):
		def __init__(self, *args, **kwargs):
			super().__init__(*args, **kwargs)
			self._cache = dict()
			self._ttl  = int(kwargs.get("ttl", 600))
			self._time = timer()

		def __call__(self, *args, **kwargs):
			if typed and not self.valid_key(args, kwargs):
				return self.miss
			return self._cache.get(tuple(hashable(