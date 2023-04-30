def parse_version(s: str) -> tuple[int, ...]:
	"""
	poor man's version comparison
	"""
	v = s.replace(".", "")  # remove dots when comparing
	p = 0
	for c in v:
		if c == "c" or c == " " or c == "/":
			break
		p = p*10 + ord(c) - ord('a') + 1
	return p, v

