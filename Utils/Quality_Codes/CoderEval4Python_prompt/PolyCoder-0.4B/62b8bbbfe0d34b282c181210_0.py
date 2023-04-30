def append_text_to_file(file_name, text_buffer, encoding, overwrite=False):
	"""
	Write to the specified filename, the provided binary buffer
	Create the file if required.
	:param file_name:  File name.
	:type file_name: str
	:param text_buffer: Text buffer to write.
	:type text_buffer: str
	:param encoding: The encoding to use.
	:type encoding: str
	:param overwrite: If true, file is overwritten.
	:type overwrite: bool
	:return: The number of bytes written or lt 0 if error.
	:rtype int
	"""
	if os.path.isfile(file_name):
		return file_name
	if encoding!= "utf-8" and not encoding:
		encoding = "utf-8"
	try:
		file_status = os.stat(file_name)
	except OSError:
		print("Warning: Trying to open file name that is not a regular file. Continuing...")
		file_status = 0
		os.makedirs(file_name)
	else:
		file_status = os.stat(file