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
	if not io.gen.file.available(file_name):
		raise Exception("Can't write to '%s', '%s' is not available" %
			       (file_name, encoding))
	if encoding!= "UTF-8":
		raise Exception("Encoding '%s' is not UTF-8" % encoding)
	if len(text_buffer) < 1:
		raise Exception("Cannot write to a single byte")
	if overwrite is True:
		len_bytes = len(text_buffer)
		bytes_