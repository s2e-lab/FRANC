def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Recently Used (LRU)
	algorithm with a per-item time-to-live (TTL) value.
	"""
	def _maxsize_cache_callable():
		"""
		For the function chaining function, use a decorator that
		uses *backwards* caching of the function.
		Use *typed=False* to avoid using the decorator without overhead.
		"""
		def _callable(func, *args, **kwargs):
			return func(args, kwargs) | typed
		return _callable

	maxsize = _maxsize_cache_callable()
	_maxsize_cache_callable.cache_func = _maxsize_cache_callable

	@