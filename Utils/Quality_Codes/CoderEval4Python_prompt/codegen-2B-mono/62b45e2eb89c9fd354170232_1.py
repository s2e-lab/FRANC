def next_version(version):
	"""
	Next version identifier following existing pattern.
	
	Must deal with both zero-prefixed and non-zero prefixed versions.
	"""
	
	if version.endswith('.'):
		# Strip.
		version = version[:-1]
	if version.startswith('0.'):
		# Zero-prefixed versioning (e.g. 0.1)
		#
		# Remove '0.', '.', and any remaining trailing '.0'.
		version = re.sub(r'(?<=0\.0)0+', '.', version[2:])[:-2]
		if version == '.':
			# Add 1 (e.g. 0