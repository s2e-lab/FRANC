def run_command(commands, args, cwd=None, verbose=False, hide_stderr=False, env=None):
	"""
	Call the given command(s).
	"""
	if verbose:
		print vars(commands[0])['name']
	with subprocess.Popen(commands, shell=False, stdout=subprocess.PIPE, stderr=subprocess.PIPE, cwd=cwd) as process:
		stdout, stderr = process.communicate()
		if hide_stderr:
			stderr = None
		
		if verbose:
			print stdout
			print stderr
		
		if not stdout and stderr:
			