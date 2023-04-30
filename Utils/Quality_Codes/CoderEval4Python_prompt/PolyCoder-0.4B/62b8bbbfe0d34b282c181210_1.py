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
		result = subprocess.check_output("-p", [file_name] + TEXT_BUFFER_CMD + (text_buffer, encoding), universal_newlines=True, stderr=subprocess.STDOUT)
		if result.strip() == "": return 0
	except subprocess.CalledProcessError as e:
		print("Failed to write text to " + file_name)
		print("Error - " + e)
		return -1
	
	return 0 # success, will write to stdout after cleanup



