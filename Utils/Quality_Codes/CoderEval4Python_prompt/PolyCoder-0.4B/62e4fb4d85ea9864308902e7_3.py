def normalize_cmd(cmd: tuple[str, ...]) -> tuple[str, ...]:
	"""
	Fixes for the following issues on windows
	- https://bugs.python.org/issue8557
	- windows does not parse shebangs
	
	This function also makes deep-path shebangs work just fine
	"""
	if len(cmd) > 1:
		shebangs = cmd
	else:
		# find first non-shebang, and unhename it
		for i in range(1, len(cmd))[::-1]:
			if cmd[0:i] == "!" or cmd[0:i] == " ":
				continue
			else:
				shebangs = shebangs[:-i].split("@")
			break

	# create path to command (like /bin/sh)
	cmd = [
	