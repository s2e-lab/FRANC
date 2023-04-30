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
	files_dirs = [os.path.join(prefix, f) for f in files]
	files_dir_paths = [os.path.join(f, f.split("/")[-1] if os.path.isdir(f) else '') for f in files_dirs]
	result = []
	
	if len(files_dir_paths) < 1:
		return list(files)
	
	for f in files_dir_paths:
		result.extend(os.listdir(f))
	return result

//
//  Copyright