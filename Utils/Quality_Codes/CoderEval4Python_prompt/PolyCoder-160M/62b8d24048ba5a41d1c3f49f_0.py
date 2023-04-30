def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Recently Used (LRU)
	algorithm with a per-item time-to-live (TTL) value.
	"""
	function = func.__doc__

	maxsize = max(maxsize, 1024)
	def ttl_cache(maxsize=maxsize, ttl=600, timer=time.monotonic, typed=False):
		return func(maxsize=maxsize, ttl=ttl, timer=timer, typed=typed)

	@staticmethod
	def to_str(obj, *args, **kwargs):
		"""Convert a ``obj`` into a dictionary for use by ``freshtime`` (reducer in
		`freshtime`) and to a ``str`` in ``obj`` that can