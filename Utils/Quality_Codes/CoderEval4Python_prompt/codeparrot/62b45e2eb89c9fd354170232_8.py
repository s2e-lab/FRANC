def next_version(version):
	"""
	Next version identifier following existing pattern.
	
	Must deal with both zero-prefixed and non-zero prefixed versions.
	"""
	

	r = []
	
	if len(version.split('.'))!= 2:
		print("Invalid version format '%s' should have format 'foo.bar.baz'", version)
		
	version, suffix = version.split('.')
	
	if version.endswith('*'):
		version = version[:-1]
		
	r.append(version)
		
	count = len(r) - 1
	
	while count >= 0:
		count -= 1
		prev = r[count]
		
		match = r[count].match(prev)
		if match:
			count += match.end()