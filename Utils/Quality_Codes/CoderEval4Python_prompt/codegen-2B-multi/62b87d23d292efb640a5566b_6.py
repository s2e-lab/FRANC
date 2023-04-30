def run_command(commands, args, cwd=None, verbose=False, hide_stderr=False, env=None):
	"""
	Call the given command(s).
	"""
	if isinstance(commands, str):
		commands = (commands, )
	
	# check for env vars in args
	# (for compatibility with ansible)
	newargs = []
	for arg in args:
		newarg='"{}"'.format(arg)
		if newarg in args:
			logger.debug("Argument %s substituted with env variable %s", arg, newarg)
			args = newargs
			break
		newargs.append(newarg)
	
	if verbose:
		