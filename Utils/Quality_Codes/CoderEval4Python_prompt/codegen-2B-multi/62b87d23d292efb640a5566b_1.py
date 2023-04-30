def run_command(commands, args, cwd=None, verbose=False, hide_stderr=False, env=None):
	"""
	Call the given command(s).
	"""
	command = [command_path] + commands
	LOG.debug('running %s', command)
	if debug:
		LOG.debug('run_command: %s %s %s', command, cwd, verbose)
		LOG.debug('run_command: %s %s %s %s', command, cwd, verbose, hide_stderr)
	p = os_utils.execute(command, cwd=cwd, stderr=hide_stderr, env=env)
	if verbose:
		LOG.debug('