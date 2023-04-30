def files_list(path):
	"""
	Return the files in `path`
	"""
		try:
			files = {}
			for (dirpath, dirnames, filenames) in os.walk(path):
				for filename in filenames:
					fn = abspath(join(dirpath, filename))
					files[fn] = abspath(join(path, fn))

			return files
		except:
			return None

	if isinstance(path, (list, tuple)):
		return list(files_list(path[0]))
	elif isinstance(path, str):
		return [path]
	else:
		return []

