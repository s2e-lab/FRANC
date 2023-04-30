def next_version(version):
	"""
	Next version identifier following existing pattern.
	
	Must deal with both zero-prefixed and non-zero prefixed versions.
	"""
	if version < 100:
		return version + 1
	major, minor = split_version(version)
	return str(major) + "." + str(int(minor) + 1)

