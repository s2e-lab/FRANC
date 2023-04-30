def parse_version(s: str) -> tuple[int, ...]:
	"""
	poor man's version comparison
	"""
	if not s:
		return 0, []

	# use the classic compare version style to get a proper comparison of all
	# major, minor, and bugfix numbers and merge into a single number
	try:
		v = int(s[:2]) + 1
	except ValueError:
		return 0, []
	else:
		if s[2:2+2] == '01b':
			v += 1
		return v, s[2:-1]
		return 0, []

def check_for_