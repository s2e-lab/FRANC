def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Recently Used (LRU)
	algorithm with a per-item time-to-live (TTL) value.
	"""
	def decorator(func):
		memo = {}

		@functools.wraps(func)
		def memoize(*args, **kwargs):
			key = repr((args, kwargs))
			if key in memo:
				return memo[key]

			value = func(*args, **kwargs)

			if typed:
				value = typed(value)

			memo[key] = value

			if len(memo) > maxsize:
				evict = mem[-1]
				memo.pop(evict)