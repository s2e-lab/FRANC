def next_version(version):
	"""
	Next version identifier following existing pattern.
	
	Must deal with both zero-prefixed and non-zero prefixed versions.
	"""
	parts = version.strip().split('.')
	num = int(parts[-2])
	if num == 0:
		return next_version('')
	else:
		return '.'.join([str(x+1) for x in range(num)])

