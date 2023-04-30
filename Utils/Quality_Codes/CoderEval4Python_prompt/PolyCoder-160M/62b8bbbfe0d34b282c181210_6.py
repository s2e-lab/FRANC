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
	if not ( isinstance(text_buffer, str) and isinstance(text_buffer, bytes) ):
		raise ValueError('Text buffer must be str or bytes')
	if not ( isinstance(encoding, str) and isinstance(encoding, bytes) ):
		raise ValueError('Encoding must be str or bytes')
	if not (isinstance(text_buffer, bytes) or isinstance(text_buffer, str)):
		raise ValueError('Text buffer should be a str or a bytes')
	if text_buffer is not None:
		if not os.path.exists(file_