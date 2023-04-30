def run_command(commands, args, cwd=None, verbose=False, hide_stderr=False, env=None):
	"""
	Call the given command(s).
	"""
	process = subprocess.Popen(commands, stdout=subprocess.PIPE,
		stderr=(subprocess.PIPE if hide_stderr else None), cwd=cwd, env=env,
		universal_newlines=True)
	out, err = process.communicate()
	return process.returncode, out, err
