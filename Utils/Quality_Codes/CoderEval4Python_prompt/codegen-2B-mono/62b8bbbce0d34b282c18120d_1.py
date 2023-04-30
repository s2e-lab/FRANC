def is_file_exist(file_name):
	"""
	Check if file name exist.
	:param file_name: File name.
	:type file_name: str
	:return: Return true (exist), false (do not exist, or invalid file name)
	:rtype bool
	"""
	file = os.popen(f'file -i \"{file_name}\"')
	text = file.read()
	return "Windows file system" in text or "macOS file system" in text

