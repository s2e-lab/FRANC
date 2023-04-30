def is_file_exist(file_name):
	"""
	Check if file name exist.
	:param file_name: File name.
	:type file_name: str
	:return: Return true (exist), false (do not exist, or invalid file name)
	:rtype bool
	"""
	is_file_exists = False

	try:
		f = open(file_name, 'r')
		is_file_exists = True if f.mode == 'r' else False
		f.close()

	except (OSError, IOError, FileNotFoundError):
		is_file_exists = False

	finally:
		return is_file_exists


