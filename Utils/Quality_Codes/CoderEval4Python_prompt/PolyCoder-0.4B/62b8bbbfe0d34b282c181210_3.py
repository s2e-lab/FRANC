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
	file_handle, file_path = os.path.split(file_name)
	if not file_path or not os.path.isabs(file_path):
		raise ValueError("The file cannot be absolute! File path: %r", file_path)
	text_buffer = text_buffer.encode(encoding)
	if file_path.startswith("."):
		file_path = "/"+file_path
	buffer = open(file_name, os.O_RDWR)
	buffer.write(text_buffer)
	buffer.close()