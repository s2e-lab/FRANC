def next_version(version):
	"""
	Next version identifier following existing pattern.
	
	Must deal with both zero-prefixed and non-zero prefixed versions.
	"""
	
	version = VersionIdentifier(version)
	
	assert version.version_size > 0
	
	if version_size_is_zero_prefixed(version.version) and \
					version[0] in ('0', '00'):
		version = version.next_version('1')
	else:
		if version.number_of_zeros:
			version = version.next_version()
			
		size_increased = version_size_has_more_bytes()
		
		if size_increased:
			version