def normalize_cmd(cmd: tuple[str, ...]) -> tuple[str, ...]:
	"""
	Fixes for the following issues on windows
	- https://bugs.python.org/issue8557
	- windows does not parse shebangs
	
	This function also makes deep-path shebangs work just fine
	"""
	shell_cmd = 'python -m pip.cmd.shebangs -q %s -c %s' % \
		(os.getenv('PIP_SHELL_ENV'), cmd)
	if subprocess.Popen(shell_cmd, shell=True).returncode!= 0:
		raise Exception('Shebang could not be converted to shebang')
	return shell_cmd


