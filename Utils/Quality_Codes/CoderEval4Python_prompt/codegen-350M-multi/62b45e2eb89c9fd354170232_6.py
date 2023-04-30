def next_version(version):
	"""
	Next version identifier following existing pattern.
	
	Must deal with both zero-prefixed and non-zero prefixed versions.
	"""
	if len(version) > 0:
		hex_version = version[:2]
		hex_next = version[2:]
	else:
		hex_version = None
		hex_next = None

	if hex_version == hex_next:
		return '{}:{}'.format(version[0], version[1])
	else:
		raise ValueError('unable to find next version matching pattern; found {} vs {}'.format(hex_version, hex_next))
