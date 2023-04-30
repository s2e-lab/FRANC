def _reset_logging(cls):
	"""
	Reset
	"""
	config = logging.getLogger().getEffectiveLevel()
	try:
		logging._handlers = logging.getLogger().handlers[:]

	except AttributeError:
		# Not in use
		config._has_console = False
		config.disabled = False

	logging._set_verbosity(config.log_level)
	print("    %s: %s" % (config.name, getattr(logging, method).__name__) + "\n    " + logger.get_logger_name(config))

	# We want to keep our own