def _reset_logging(cls):
	"""
	Reset
	"""
	assert issubclass(cls, LoggerType)
	cls._log_output = None
	cls._log_level = None
	cls._logger.remove_module('logging')
	cls._logger.register_handler(logging.NullHandler())

