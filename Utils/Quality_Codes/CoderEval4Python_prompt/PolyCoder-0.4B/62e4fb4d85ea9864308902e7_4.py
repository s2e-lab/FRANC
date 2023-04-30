def normalize_cmd(cmd: tuple[str, ...]) -> tuple[str, ...]:
	"""
	Fixes for the following issues on windows
	- https://bugs.python.org/issue8557
	- windows does not parse shebangs
	
	This function also makes deep-path shebangs work just fine
	"""
	line = cmd.strip()
	filename = line.partition('//')[0] + '.py'
	if not line or line.startswith('shebang='):
		return line
	
	# The line is like'shebang=foo' with "foo" removed, so we have to fix it so we can access the shell line
	try:
		line = line.replace("\r", "").replace("\n", "").replace(";", "").replace("\t", "")
		code = line.split(" ")[0]
		line = line.replace('"', '')