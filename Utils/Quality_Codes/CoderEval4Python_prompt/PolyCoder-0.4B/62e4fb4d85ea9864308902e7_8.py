def normalize_cmd(cmd: tuple[str, ...]) -> tuple[str, ...]:
	"""
	Fixes for the following issues on windows
	- https://bugs.python.org/issue8557
	- windows does not parse shebangs
	
	This function also makes deep-path shebangs work just fine
	"""
	if isinstance(cmd, list):
		return tuple(normalize_cmd(a) for a in cmd)
	elif isinstance(cmd, str):
		return cmd
		"""
		if isinstance(cmd, int):
			cmd = int(cmd)
		# convert to string
		cmd = re.sub("([^\s]+)", "[1-9#]+", cmd)
		
		# convert to python3 and 2 arguments
		cmd = re.sub("'([^\s]+)", "[a-zA-Z]+", cmd)
