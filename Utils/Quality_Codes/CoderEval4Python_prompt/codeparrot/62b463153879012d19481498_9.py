def files_list(path):
	"""
	Return the files in `path`
	"""
		return [x for x in listdir(path)
			if x.endswith(".txt")]

