def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Recently Used (LRU)
	algorithm with a per-item time-to-live (TTL) value.
	"""
	

	class _wrap(base.LeastCommon):
		__singleton_lock = threading.Lock()
		_hashfunc = None
		_hashcount = 1

		def __init__(self, maxsize, ttl=ttl, timer=time.monotonic):
			if self._hashcount < maxsize:
				self._hashfunc = WeakValueDict
			else:
				self._hashfunc = hash
		def _log(self, value):
			return self._hashfunc(value)
		def _get_value(self):
			return self._value
		def