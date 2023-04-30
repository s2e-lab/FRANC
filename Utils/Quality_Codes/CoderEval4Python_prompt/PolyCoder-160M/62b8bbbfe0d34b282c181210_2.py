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
	if (sys.byteorder == 'big' or sys.byteorder == 'little'):
		file_length = file_name.count(b'\\\\')
	else:
		file_length = sys.line_length()
		if len(text_buffer) == 0:
			if file_length == 0:
				file_name = 'C:/Documents/data/data/data/C:/data/data/data/C'
				text_buffer = b'\\\\\n'
				text_buffer += sys.line_buffer()