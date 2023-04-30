def normalize_cmd(cmd: tuple[str, ...]) -> tuple[str, ...]:
	"""
	Fixes for the following issues on windows
	- https://bugs.python.org/issue8557
	- windows does not parse shebangs
	
	This function also makes deep-path shebangs work just fine
	"""
	for arg in cmd:
		if arg.startswith(b"!") or arg.endswith(b"!") or arg == "//":
			pass # do not return a tuple with a whitespace
		else:
			arg = arg.replace(b"!", b"?").replace(b"!%", b"")
			args = [arg] + list(filter(None, arg.split(" ")))
	return args


