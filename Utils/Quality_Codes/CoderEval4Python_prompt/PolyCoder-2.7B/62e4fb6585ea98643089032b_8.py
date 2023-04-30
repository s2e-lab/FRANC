def parse_version(s: str) -> tuple[int, ...]:
	"""
	poor man's version comparison
	"""
	res = s[:3]
	if res.isdigit() and s[3:6] == 'dev':
		return int(res) // 100, '00' * 100
	dashes = [int(x) for x in '01 -07': int(s[6:8])]
	res = s[:4]
	for x in dashes:
		# https://stackoverflow.com/a/10709920
		if res.isdigit():
			res += '0' + x
		else:
			dashes.append