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
	if not ignore_errors:
		line_count, total_bytes, file_start, file_end = \
			summarize_message_file_contents(file_name, text_buffer, \
				encoding, overwrite)
		if line_count!= total_bytes:
			debug("ERROR: Unable to write %s to disk; " \
				"Error count %d; file error %d " + \
				"file start %d; file end %d", file_name,
				line_count, total_bytes