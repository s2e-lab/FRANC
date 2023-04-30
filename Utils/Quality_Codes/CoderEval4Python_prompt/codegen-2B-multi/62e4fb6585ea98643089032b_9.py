def parse_version(s: str) -> tuple[int, ...]:
	"""
	poor man's version comparison
	"""
	numeric: str = s.strip()
	parts: List[str] = numeric.split(".")
	if parts[0]:
		return int(numeric), parts
	else:
		return 0, parts
