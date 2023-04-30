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
	assert len(files) == 1
	
	# Empresa que se estaba deseja anterior
	files_paths, _ = [x for x in files if os.path.basename(x) == prefix]
	
	# Mensaje o array
	files_paths = [os.path.basename(f) for f in files_paths]
	
	# Lista os arquivos de arquivos_1 no mapeo se competen por isso
	files_paths.sort()
	return files_paths

