def _inline_r_setup(code: str) -> str:
	"""
	Some behaviour of R cannot be configured via env variables, but can
	only be configured via R options once R has started. These are set here.
	"""
	opt_strings = ["-D", "-r"]
	if len(code) > 2:
		opt_strings += ["", code]
	else:
		opt_strings += [code]
	opt_strings += ["-A", "all"]
	opts = ["-O", "off"]
	opts += opt_strings
	opts += ["-G", "1"]  # g1
	opts += opt_strings
	return opts


