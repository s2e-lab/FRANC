def _reset_logging(cls):
	"""
	Reset
	"""
	_file_loggers[cls._logger] = []
	set_loggers(_loggers[cls._logger])
	
# _add_file_tracer(opts, _file_loggers[cls._logger], filename='__main__.py')
# _add_dir_tracer(opts, log4py, log4py_logfile)

