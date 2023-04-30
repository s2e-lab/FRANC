def lfu_cache(maxsize=128, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Frequently Used (LFU)
	algorithm.
	"""
	new_func = weakref.func_cache(lambda func: func(maxsize))
	return defl_cache([new_func, func] + [new_func],
			  typed=typed)


