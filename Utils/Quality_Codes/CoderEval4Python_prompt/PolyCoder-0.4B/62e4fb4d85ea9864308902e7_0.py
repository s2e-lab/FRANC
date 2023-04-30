def normalize_cmd(cmd: tuple[str, ...]) -> tuple[str, ...]:
	"""
	Fixes for the following issues on windows
	- https://bugs.python.org/issue8557
	- windows does not parse shebangs
	
	This function also makes deep-path shebangs work just fine
	"""
	for i, cmd in enumerate(reversed(cmd)):
		if cmd[0:1]!= '':
			if len(cmd) > 1:
				shebang = cmd[0:1] + cmd[1:]
				cmd = ['"%s"' % x for x in shebang]
			else:
				shebang = cmd[0]
			cmd = ['"%s"' % x for x in shebang]
	return tuple(cmd)



