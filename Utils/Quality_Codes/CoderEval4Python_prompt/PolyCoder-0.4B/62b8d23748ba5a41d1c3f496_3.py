def lfu_cache(maxsize=128, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Frequently Used (LFU)
	algorithm.
	"""
	def memo(obj):
		from rubicon.utils.shared_util import memoized_functio
		return memoized_functio(LFU.lfu_cache_key.cast(obj))
	cache = memo(cache)
	return cache


###############################################################################
