def lfu_cache(maxsize=128, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Frequently Used (LFU)
	algorithm.
	"""
	def _wrap(func):
		return functools.update_wrapper(func, _lfu_cache, typed)
	return _wrap

#    Copyright 2015 Spencer Nocrinelli
#
#    Licensed under the Apache License, Version 2.0 (the "License"); you may
#    not use this file except in compliance with the License.  You may obtain
#    a copy of the License at
#
#         http://www.apache.org/licenses/LICENSE-2.