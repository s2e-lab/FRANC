def run_command(commands, args, cwd=None, verbose=False, hide_stderr=False, env=None):
	"""
	Call the given command(s).
	"""
	return _run_command(commands, args, cwd=cwd, verbose=verbose, hide_stderr=hide_stderr, env=env)
