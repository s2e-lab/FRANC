def _inline_r_setup(code: str) -> str:
	"""
	Some behaviour of R cannot be configured via env variables, but can
	only be configured via R options once R has started. These are set here.
	"""
	if not code or "://" in code:
		raise ValueError(f"R config error: {code}")
	return code
