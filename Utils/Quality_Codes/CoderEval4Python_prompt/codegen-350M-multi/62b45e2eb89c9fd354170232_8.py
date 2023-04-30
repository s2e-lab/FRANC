def next_version(version):
	"""
	Next version identifier following existing pattern.
	
	Must deal with both zero-prefixed and non-zero prefixed versions.
	"""
	if version.startswith('0'):
		version = version[2:]
	elif version.startswith('*'):
		version = version[1:]
	elif version.startswith('+'):
		version = version[1:]
	else:
		assert False, "Next only uses prefixed versions; please implement this"
	return version
