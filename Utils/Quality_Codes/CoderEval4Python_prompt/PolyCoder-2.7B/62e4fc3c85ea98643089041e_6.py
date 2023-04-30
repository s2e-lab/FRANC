def _inline_r_setup(code: str) -> str:
	"""
	Some behaviour of R cannot be configured via env variables, but can
	only be configured via R options once R has started. These are set here.
	"""
	command = "setup_r." + code
	p = subprocess.Popen(
		command,
		shell=True,
		stdout=subprocess.PIPE,
		stderr=subprocess.STDOUT,
		cwd=PATH,
	)
	return p.wait()


