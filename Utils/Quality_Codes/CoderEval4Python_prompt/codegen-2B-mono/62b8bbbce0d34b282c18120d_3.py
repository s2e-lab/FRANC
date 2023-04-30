def is_file_exist(file_name):
	"""
	Check if file name exist.
	:param file_name: File name.
	:type file_name: str
	:return: Return true (exist), false (do not exist, or invalid file name)
	:rtype bool
	"""
	if type(file_name)!= str:
		return False
	elif os.path.isfile(file_name) == False:
		return False
	else:
		return os.path.splitext(file_name)[-1].strip().lower() == ".csv"


