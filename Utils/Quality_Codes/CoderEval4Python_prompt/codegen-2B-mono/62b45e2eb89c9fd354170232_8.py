def next_version(version):
	"""
	Next version identifier following existing pattern.
	
	Must deal with both zero-prefixed and non-zero prefixed versions.
	"""
	return _next_v4(rng(version))

