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
	if not os.path.isfile(file_name):
		raise ValueError("file_name is not a valid file")

	if encoding == 'utf-8' and not overwrite: # 'encoding="utf-8"' == False
		if len(text_buffer) > 0:
			write_file(file_name, text_buffer, encoding='utf-8')
		else:
			print("Invalid or empty file name :", file_name)
			return 0
	else:
		# Check if the file must be up