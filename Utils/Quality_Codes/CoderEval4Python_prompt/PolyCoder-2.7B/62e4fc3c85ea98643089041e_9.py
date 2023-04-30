def _inline_r_setup(code: str) -> str:
	"""
	Some behaviour of R cannot be configured via env variables, but can
	only be configured via R options once R has started. These are set here.
	"""
	setup_code = f'''
	from {__name__} import *
	def setup_code(setup):
		setup(message=string(R.config, 'ascii:'),
			config={R.CONFIG},
			options={R.OPTS})
	'''.format(
		__name__='R.setup_code',
		__package__=__package__,
	)

	# Generate function to be called from R in setup_code, to get
	# message/filename for R.config if set.
	function = f"""