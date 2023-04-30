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
	# Write the file
	if file_name!= "" and os.access(file_name, os.X_OK):
		file_exists = True
		# Creating the file if not exist
		try:
			if overwrite:
				os.rename(file_name, file_name + ".wbph")
			else:
				if file_name!= _temp_prefix+"{0}:{1}_{2}.wbph".format(encoding, encoding, _temp_prefix):
					os.rename(file_name,