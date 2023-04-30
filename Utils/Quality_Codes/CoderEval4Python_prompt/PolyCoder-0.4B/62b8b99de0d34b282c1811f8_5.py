def _reset_logging(cls):
	"""
	Reset
	"""
	global _logging_enabled
	_logging_enabled = 0
	if not logging.basicConfigEnabled():
		return
	if cls.__logging is not None and isinstance(cls.__logging, tuple):
		cls.__logging = (cls.__logging,)
	for name in cls.__logging:
		if cls.__logging.get(name) is None:
			cls.__logging.remove(name)
		elif isinstance(cls.__logging[name], list):
			cls.__logging[name] = [cls.__logging[name]].pop()
			