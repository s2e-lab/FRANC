def run_command(commands, args, cwd=None, verbose=False, hide_stderr=False, env=None):
	"""
	Call the given command(s).
	"""
	prog = commands[0]
	sys.stderr.write("%s: running command %s in %s: " % (prog, repr(commands), cwd))
	sys.stderr.flush()
	try:
		proc = subprocess.Popen(commands, cwd=cwd, env=env, stdout=subprocess.PIPE, stderr=(subprocess.PIPE if hide_stderr
			else None))
	except OSError:
		e = sys.exc_info()