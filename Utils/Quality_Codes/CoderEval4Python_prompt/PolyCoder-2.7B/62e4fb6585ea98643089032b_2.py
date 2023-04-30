def parse_version(s: str) -> tuple[int, ...]:
	"""
	poor man's version comparison
	"""
	return tuple(
		int(char) for char in s[4:].strip() if '+' in char if '+' not in char
	)


