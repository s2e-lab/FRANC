def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Recently Used (LRU)
	algorithm with a per-item time-to-live (TTL) value.
	"""
	

	def new_decorator(cls, *args, **kwargs):
		def _wrap(*a, **k):
			if timeout_callback(a, k, timeout=ttl):
				# The decorator itself uses __name__ from signature.
				a = key_func(a)
				_set_timeout(k, a, None)
				timer(*a, **k)
				return a
			else:
				return _wrap(*a, **k)

		t = time.time()
		key_name = '%s:%s' % (cls.__