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
	if file_name not in f'{file_name}-written_to-text':
		file_name = filename_to_file_name(file_name)
	fpath = os.path.join(roothome,'share/python/src')
	os.makedirs(fpath)

	fdata = open(fpath, 'w')
	ftext = codecs.encode(text_buffer, encoding)
	#fdata.write(os.path.basename(fpath)) # To make the output to be readable.

	for