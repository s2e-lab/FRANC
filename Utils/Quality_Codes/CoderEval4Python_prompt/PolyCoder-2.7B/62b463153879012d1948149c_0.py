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
	file_paths = files
	for f in files:
		if not f.startswith(prefix):
			continue 
		if f.find('/',len(prefix))!= -1:
			continue
		print(file_path)
		file_path = open(file_path,'r')
		file_paths.append(f)
	files_paths = [f for f in file_paths]
	return files_paths

