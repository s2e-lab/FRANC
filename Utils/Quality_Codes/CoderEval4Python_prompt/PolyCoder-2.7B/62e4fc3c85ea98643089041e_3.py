def _inline_r_setup(code: str) -> str:
	"""
	Some behaviour of R cannot be configured via env variables, but can
	only be configured via R options once R has started. These are set here.
	"""
	options = os.environ
	r_options = r_options_dict()
	# TODO: find a way to configure R here.
	r_options[Config.R] = {
		'type': 'inline',
	}
	if os.name == 'nt':
		r_options[Config.R]['inline'] = 1
	# TODO: find a way to configure R here.
	for key in 'inline_options', 'inline_option':
		try:
			value = options[_key]
		except KeyError:
