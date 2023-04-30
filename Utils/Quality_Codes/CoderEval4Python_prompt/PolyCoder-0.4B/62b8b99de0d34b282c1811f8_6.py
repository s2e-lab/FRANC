def _reset_logging(cls):
	"""
	Reset
	"""
	cls.logging = []
	logging.basicConfig(level=logging.DEBUG, format="%(asctime)s:%(module)s:%(lineno)s:%(message)s" % cls)
	logging.getLogger().setLevel(logging.DEBUG)

