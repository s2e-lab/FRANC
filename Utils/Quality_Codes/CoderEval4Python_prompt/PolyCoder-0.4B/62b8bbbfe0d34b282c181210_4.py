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
	if not os.path.exists(file_name):
		os.mkdir(file_name)

	buffer = io.TextIOWrapper(text_buffer, encoding)
	output_file_name = os.path.splitext(file_name)[0]
	assert os.path.exists(output_file_name), (
		"Output file '{}' does not exist, assuming to use same name as created."
	)
	assert os.path.isfile(output_file_name), (
		"Output file '{0}' does not