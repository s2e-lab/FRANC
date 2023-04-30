def is_file_exist(file_name):
	"""
	Check if file name exist.
	:param file_name: File name.
	:type file_name: str
	:return: Return true (exist), false (do not exist, or invalid file name)
	:rtype bool
	"""
	if not isinstance(file_name, str):
		return False
	if os.path.isfile(file_name):
		return True
	
	return False

