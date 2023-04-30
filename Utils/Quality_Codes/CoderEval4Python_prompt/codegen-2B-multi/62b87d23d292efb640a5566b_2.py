def run_command(commands, args, cwd=None, verbose=False, hide_stderr=False, env=None):
	"""
	Call the given command(s).
	"""
	proc = Popen(commands, cwd=cwd, env=env, stdout=PIPE, stderr=PIPE)

	stdout, stderr = proc.communicate()
	return proc.returncode, stdout, stderr

