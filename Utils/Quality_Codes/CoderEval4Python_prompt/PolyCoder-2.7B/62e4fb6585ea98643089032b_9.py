def parse_version(s: str) -> tuple[int, ...]:
	"""
	poor man's version comparison
	"""
	parts = s.split('.')
	return (
		int(parts[0]),
		'.'.join(str(int(x))
		         for x in parts[1:])
	)
