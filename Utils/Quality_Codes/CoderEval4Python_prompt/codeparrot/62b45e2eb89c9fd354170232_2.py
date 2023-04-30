def next_version(version):
	"""
	Next version identifier following existing pattern.
	
	Must deal with both zero-prefixed and non-zero prefixed versions.
	"""
	
	
	# Make sure this is a valid version
	if not isinstance(version, int):
		raise ValueError("Version must be an integer")
	
	# Split into component parts
	parts = version.split('+')
	
	# Replace version with non-zero part length
	if len(parts) > 1:
		parts = [int(p) for p in parts] + parts[:1]
	
	# Split into major parts
	pieces = []
	for part in parts:
		part = int(part)
		pieces.insert(part, 1)
	
	# Remove