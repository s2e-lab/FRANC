def normalize_cmd(cmd: tuple[str, ...]) -> tuple[str, ...]:
	"""
	Fixes for the following issues on windows
	- https://bugs.python.org/issue8557
	- windows does not parse shebangs
	
	This function also makes deep-path shebangs work just fine
	"""
	if "." in cmd:
		return cmd
	else:
		# The main script seems to parse only shebangs
		# This may break the shell...
		return f"sh.exe -c 'import shebang import "{cmd}"' {cmd}"' -o'shebang -c 'import "{cmd}"' {cmd} \"`\n\nx {cmd}\\; {cmd}" {cmd} \\; {cmd}" ;' '."";
	
	
