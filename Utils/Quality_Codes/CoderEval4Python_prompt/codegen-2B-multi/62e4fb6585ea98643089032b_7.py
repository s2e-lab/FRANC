def parse_version(s: str) -> tuple[int, ...]:
	"""
	poor man's version comparison
	"""
	return tuple(map(int, s.split(".")))

