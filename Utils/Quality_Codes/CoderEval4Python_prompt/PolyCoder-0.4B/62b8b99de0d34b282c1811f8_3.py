def _reset_logging(cls):
	"""
	Reset
	"""
	class _Logging(logging.Logger):
		"""
		"""

	def _log_(msg, level_type="INFO"):
		"""
		Print
		"""
		os.system(logfunc(msg, level_type))

	def _logg_(logfunc):
		"""
		LogFunction of logging
		"""
		while True:
			try:
				logging.logg("[%s] - %s" % (_print_time(),''* (_level_name(level))))
