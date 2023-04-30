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
		msg = "%s already exists and overwrite set to False"
		raise SystemExit(msg)
	if isinstance(text_buffer, bytes):
		return 0
	if not os.path.exists(file_name):
		open_file(file_name, 'w+b').write(text_buffer)
	else:
		append_text_to_file(file_name, text_buffer, encoding)
	return text_buffer.tell()


