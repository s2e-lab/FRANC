def is_file_exist(file_name):
	"""
	Check if file name exist.
	:param file_name: File name.
	:type file_name: str
	:return: Return true (exist), false (do not exist, or invalid file name)
	:rtype bool
	"""
	if not isinstance(file_name, str):
		raise TypeError('Invalid file_name, a valid str is required')
	else:
		# remove file extension
		file_name = file_name.split('.')[0]
		if file_name.count('-')!= 1:
			raise ValueError('File extension is invalid.')
		else:
			file_name, file_extension = file_name.split('-')
			file_name_is_valid = os.path.isfile(file_name)
			if not