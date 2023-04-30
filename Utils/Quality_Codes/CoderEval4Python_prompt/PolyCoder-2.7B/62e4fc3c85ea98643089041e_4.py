def _inline_r_setup(code: str) -> str:
	"""
	Some behaviour of R cannot be configured via env variables, but can
	only be configured via R options once R has started. These are set here.
	"""
	# try to load user-defined R options that we can
	try:
		with open("R_OPTIONS", "r") as fh:
			opts = fh.read()
	except IOError:
		# user does not have R options, use defaults for environment
		opts = config.env["R_OPTIONS"]
	try:
		opts += ["-r", code]
		return "\n".join(opts)
	except NoOptionError:
		log.error("Could not load R option file\n\n%r"