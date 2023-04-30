def next_version(version):
	"""
	Next version identifier following existing pattern.
	
	Must deal with both zero-prefixed and non-zero prefixed versions.
	"""
	

	versions = version.split('.')
	length = len(versions)

	# Make sure we are comprehensible.
	if len(version) == 1:
		return version[-1]
	else:
		assert 1 == length, 'Could not find a pattern for version {0}.'.format(version)
		

	# Find the maximum number of version extensions to exclude from the one before the rest
	if len(versions) > 0:
		extensions = str(max(list(filter(lambda x: not x.endswith('-') and x!= '.x', versions))))