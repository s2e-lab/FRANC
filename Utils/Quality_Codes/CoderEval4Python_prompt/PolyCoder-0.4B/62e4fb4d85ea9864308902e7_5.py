def normalize_cmd(cmd: tuple[str, ...]) -> tuple[str, ...]:
	"""
	Fixes for the following issues on windows
	- https://bugs.python.org/issue8557
	- windows does not parse shebangs
	
	This function also makes deep-path shebangs work just fine
	"""
	if isinstance(cmd, list):
		cmd = cmd[0]
	
	elif isinstance(cmd, str):
		# no shell command as shebangs and no script are allowed
		if cmd == '' or shell_cmd(cmd)!= 'file':
			cmd = '#'
		
	if type(cmd) is tuple:
		cmd_parts = cmd
		
	else:
		cmd_parts = [cmd]
		
	while cmd_parts:
		cmd_parts = [os.sep.join(parts) for parts in cmd