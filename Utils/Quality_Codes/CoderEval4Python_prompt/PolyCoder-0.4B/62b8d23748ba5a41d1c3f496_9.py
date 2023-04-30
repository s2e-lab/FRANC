def lfu_cache(maxsize=128, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Frequently Used (LFU)
	algorithm.
	"""
	def func(a, *, memo=None, t=time.time, timeout=5):
		return functools.partial(func, a = a, memo=memo, t=t, timeout=timeout)
	return func

