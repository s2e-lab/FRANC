def _inline_r_setup(code: str) -> str:
	"""
	Some behaviour of R cannot be configured via env variables, but can
	only be configured via R options once R has started. These are set here.
	"""
	if settings.get_bool("r_running"):
		return code
	code += "# This is now the start"
	code += "def __r_startup_code(self, console=False):\r\n%s" % (code,)

	code += """\