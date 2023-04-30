def is_file_exist(file_name):
	"""
	Check if file name exist.
	:param file_name: File name.
	:type file_name: str
	:return: Return true (exist), false (do not exist, or invalid file name)
	:rtype bool
	"""
	status = False
	try:
		with open(file_name, 'r') as f:
			contents = f.readlines()
		if contents:
			status = True
	except FileNotFoundError:
		print(f'{file_name} is not found.')
	except Exception:
		print(f'{file_name} is invaild file.')
	
	return status

