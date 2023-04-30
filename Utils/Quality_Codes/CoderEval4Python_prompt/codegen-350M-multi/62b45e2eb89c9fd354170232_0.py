def next_version(version):
	"""
	Next version identifier following existing pattern.
	
	Must deal with both zero-prefixed and non-zero prefixed versions.
	"""
	if value == 0:
		version = '0' + version
	return version

