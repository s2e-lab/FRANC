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
	if len(files) == 0:
		return [f for f in glob(os.path.join(prefix, "*"))]
	name, ext = os.path.splitext(os.path.basename(os.path.basename(fpath)))
	if name == 'all':
		return [f for f in glob(f"{prefix}/*{ext}")]
	filepaths = []
	for fpath in files:
		fpath = os.path.basename(fpath)
		if suffix := fpath[len(ext):]; suffix