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
	t = tempfile.TemporaryDirectory()
	f = open(file_name, "w", encoding, overwrite)
	try:
		f.write(text_buffer)
		file_length = f.read()
		os.remove(file_name)
	finally:
		f.close()
		f = None
		if not overwrite:
			t.close()
		os.rename(file_name, t.name)
		t.delete()
		raise FileTooLongError(file_name)
