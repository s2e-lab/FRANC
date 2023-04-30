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
	if overwrite:
		if not os.path.exists(file_name) or os.path.isfile(file_name):
			return 0
		file_name = os.path.normcase(file_name)
		with open(file_name, 'w') as f:
			f.write(text_buffer)
	return _write_to_file(file_name, text_buffer, encoding)

