def next_version(version):
	"""
	Next version identifier following existing pattern.
	
	Must deal with both zero-prefixed and non-zero prefixed versions.
	"""
	
	suffix_re = re.compile('([.0-9]+)((?=\.|$))')
	parts = suffix_re.split(version)
	
	try:
		number = int(parts[0])
	except ValueError:
		raise exceptions.InvalidVersionNumber(version)
	
	if len(parts) == 1:
		suffix = None
	elif parts[1].endswith('.0'):
		suffix = parts[1][:-2]
	else:
		suffix = parts