def verifyClass(iface, candidate, tentative=False):
	"""
	Verify that the *candidate* might correctly provide *iface*.
	"""
	try:
		verify(candidate, "iface", iface)
	except Exception:
		if not tentative and _debug:
			from traceback import format_exc
			_log.warn("Invalid class '%s': %s", candidate.__class__.__name__, format_exc())
		return False
	else:
		return True
