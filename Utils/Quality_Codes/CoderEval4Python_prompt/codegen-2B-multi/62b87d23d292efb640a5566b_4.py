def run_command(commands, args, cwd=None, verbose=False, hide_stderr=False, env=None):
	"""
	Call the given command(s).
	"""
	assert not isinstance(args, dict), "Unknown argument type!"
	if env is None:
		env = []
	cmd = shlex.split(command_string + args) + [cwd]
	assert not isinstance(cmd, basestring), "Please pass an array"
	p = Popen(cmd, stdout=PIPE, stderr=(PIPE if hide_stderr else None), shell=False,
			env=env, cwd=cwd)
	(stdo, stde) = p.communicate()