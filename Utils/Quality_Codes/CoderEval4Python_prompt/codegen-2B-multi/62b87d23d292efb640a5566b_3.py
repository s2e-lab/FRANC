def run_command(commands, args, cwd=None, verbose=False, hide_stderr=False, env=None):
	"""
	Call the given command(s).
	"""
	_, cmds = _convert_cmd(commands, args)
	proc = _start_command(cmds, cwd, env)
	exit_code, output, error = _wait_for_exit_code(proc)
	return (exit_code, output, error)

