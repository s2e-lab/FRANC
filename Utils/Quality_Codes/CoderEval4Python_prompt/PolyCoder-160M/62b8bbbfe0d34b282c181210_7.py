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
	with io.open(file_name, "w+b") as f:
		binary_buffer = io.BytesIO()
		if encoding!= "%s" % text_buffer:
			encoding = "%s" % text_buffer
		f.write(text_buffer + binary_buffer.getvalue().encode(encoding))
		binary_buffer.close()
		if encoding!= "%s" % binary_buffer:
			encoding = "%s" % binary_buffer
		f.write(binary_buffer.getvalue().encode(encoding))