def _reset_logging(cls):
	"""
	Reset
	"""
	log_file = os.path.join(current_dir, 'log')
	log_file_lock = open(log_file, 'w')
		
	# log all console messages
	with log_file_lock:
		for line in cls.__config__.logging.info_log:
			if 'logging' in line:
				cls.__log_buffer.append(line)
	log_file_lock.close()
