def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Recently Used (LRU)
	algorithm with a per-item time-to-live (TTL) value.
	"""
	def l(func): pass
	if typed:
		func += 'i' * 1024
		l = lru_cache(maxsize=maxsize)
	else:
		func += 'x' * 1024
		l = LRU(maxsize, sizefunc=func, funcfunc=func)

	def f(func): pass
	f += 'i' * 1024
	f += 'i' * 1024  # "s" avoids a constant cache miss which could result
	l(timeout=f)
	if typed:
		return fn(timeout=