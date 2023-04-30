def next_version(version):
	"""
	Next version identifier following existing pattern.
	
	Must deal with both zero-prefixed and non-zero prefixed versions.
	"""
	if not isinstance(version, (str, unicode)):
		raise TypeError('expected unicode, got str, %s' % type(version))
	
	if not version.startswith('@'):
		raise TypeError('expected a string with @ sign, got %s' % type(version))
	
	prefix = version.replace('@', '')
	
	# Handle zero prefixed version.
	if prefix[-1] in ('', '@@'):
		return version[:-1]
	
	return version


