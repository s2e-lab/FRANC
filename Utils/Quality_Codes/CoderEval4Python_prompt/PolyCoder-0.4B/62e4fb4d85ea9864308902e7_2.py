def normalize_cmd(cmd: tuple[str, ...]) -> tuple[str, ...]:
	"""
	Fixes for the following issues on windows
	- https://bugs.python.org/issue8557
	- windows does not parse shebangs
	
	This function also makes deep-path shebangs work just fine
	"""
	cmd = cmd[1:] # Skip over the shebang

	lines = cmd.split('\n')

	cmd_lines = lines[:-1] # Keep the first line
	cmd_lines.append("\\x")
	re_open_quotes = re.compile(r"""  #\s+'''\(\)`)""")

	# Strip the shebang
	shebang_lines = re_open_quotes.findall(lines [1])

	# Remove all but the start marker
	shebang_lines.pop(-1)

	cmd