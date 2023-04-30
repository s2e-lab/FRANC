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
	try:
		size, start = ft.tcgetattr(self.fc, file_name)
		offset, size = ft.tcgetattr(self.fh, file_name) * 1000
		data = self.decode_binary(text_buffer, encoding)
		file_name = ''
		if overwrite:
			file_name = '{:.2f}'.format(lt_offset + offset)
		offset = len(file_name) - lt_offset
		if size <= len(data) / 1024 or size > 512:
