def _inline_r_setup(code: str) -> str:
	"""
	Some behaviour of R cannot be configured via env variables, but can
	only be configured via R options once R has started. These are set here.
	"""
	

	# No-op
	r_options = {}

	# Set a default value if you want a specific value. None if not present.
	if "r_default" not in code:

		r_options[
			"r_default"
		] = True

	# Add these to the r_options dictionary.
	r_options["r_type"] = code

	# Add the default and user specified flags.
	r_options["r_flags"] = r_options.get("r_flags", [])

	# Default setting

	# Set