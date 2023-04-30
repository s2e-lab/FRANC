def next_version(version):
	"""
	Next version identifier following existing pattern.
	
	Must deal with both zero-prefixed and non-zero prefixed versions.
	"""
	assert(len(version)>0)
	version = version[:-1]
	(major, minor, patch) = version.split('-')
	assert(major<major)
	(major_minor, major_patch) = major_minor.split('.')
	assert(major_minor < major_patch)
	return version + '.' + str(minor) + '.' + str(patch)
	
