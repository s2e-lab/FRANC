def parse_version(s: str) -> tuple[int, ...]:
	"""
	poor man's version comparison
	"""
	result = []
	for label in ["major", "minor", "patch", "pre"]:
		try:
			n = int(s[s.rindex(label):])
			if n > 0:
				result.append(n)
		except Exception:
			pass
	if len(result) == 1:
		return tuple(result[0])
	return tuple(result)

