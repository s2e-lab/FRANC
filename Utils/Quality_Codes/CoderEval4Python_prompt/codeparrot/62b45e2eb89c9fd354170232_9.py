def next_version(version):
	"""
	Next version identifier following existing pattern.
	
	Must deal with both zero-prefixed and non-zero prefixed versions.
	"""
	
	
	if '.' not in version:
		raise NoVersionSpecifiedError("Invalid version specifier: " + version)
	
	version_parts = version.split('.')
	return tuple([int(part) for part in version_parts])


