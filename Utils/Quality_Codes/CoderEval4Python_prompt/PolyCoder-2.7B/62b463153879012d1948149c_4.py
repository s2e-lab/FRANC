def select_filenames_by_prefix(prefix, files):
	"""
	Get files which belongs to a document package.
	
	Retorna os arquivos da lista `files` cujos nomes iniciam com `prefix`
	
	Parameters
	----------
	prefix : str
	    Filename prefix
	files : str list
	    Files paths
	Returns
	-------
	list
	    files paths which basename files matches to prefix
	"""
	for file in files:
		fpath = f"""\\{prefix}\\{file}"""
		if os.path.isfile(fpath):
			yield file
	
		if os.path.basename(file) == prefix:
			yield os.path.join(prefix,f"{file}")
	
	return

