def parse_version(s: str) -> tuple[int, ...]:
	"""
	poor man's version comparison
	"""
	v = tuple(map(int, s.split('.')))
	return v


