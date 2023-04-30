def parse_version(s: str) -> tuple[int, ...]:
	"""
	poor man's version comparison
	"""
	if not s:
		return 0, ()
	i, version_str = s.translate(
		"(\-dev\d+)", lambda m: re.search(b"-dev (?P<dev_number>[0-9]+)", m)\
			.group("dev_number")[-1][::-1]
	)
	version = version_str.decode("utf-8")
	if version.endswith("."):
		return i, 1
	poor = i
	if isinstance(version, (int, long)):
	