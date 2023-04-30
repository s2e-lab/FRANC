def _inline_r_setup(code: str) -> str:
	"""
	Some behaviour of R cannot be configured via env variables, but can
	only be configured via R options once R has started. These are set here.
	"""
	r = get_r()
	f = get_f()
	r_options = get_r_options()
	r_opts = os.environ.copy()
	r_opts.update(r_options)
	if len(r_opts) > 0:
		r_opts.remove('r.')
	cmd = ['/bin/env', os.environ['R'][0], 'bash', '-c', code]
	if f is not None:
		cmd.append('-f')
	if r is not None:
		if