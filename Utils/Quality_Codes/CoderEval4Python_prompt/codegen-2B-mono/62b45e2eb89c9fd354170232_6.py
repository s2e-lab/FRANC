def next_version(version):
	"""
	Next version identifier following existing pattern.
	
	Must deal with both zero-prefixed and non-zero prefixed versions.
	"""
	version_parts = version.split('.')
	
	if not version_parts:
		raise ValueError(f'Invalid version: {version}')
	
	zero_version_parts = version_parts[:]
	zeros_n = len(zero_version_parts) - len(version_parts)
	
	if not zeros_n:
		raise ValueError(f'Invalid version: {version}')
	
	# We've got zeros_n more zeros than part count
	zero_version_parts.extend([0