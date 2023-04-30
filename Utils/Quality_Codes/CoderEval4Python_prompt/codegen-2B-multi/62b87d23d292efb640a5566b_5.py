def run_command(commands, args, cwd=None, verbose=False, hide_stderr=False, env=None):
	"""
	Call the given command(s).
	"""
	p = subprocess.Popen(commands, stdin=subprocess.PIPE, cwd=cwd, shell=True, env=env)
	p.wait()
	if verbose:
		print(p.communicate()[0])
	if p.returncode!= 0 and hide_stderr:
		p.stderr.close()
		print("")

	if verbose >= 2:
		_, errstr = p.communicate()
		if p.returncode!= 0 and not errstr:
			errstr