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
	# Get list of files in the same package
	files = files.split(os.path.sep)
	
	# List files in the same package
	files.sort()
	
	# Extract prefix from filenames
	prefix = prefix.split(' ')
	
	# Loop across every file in the package
	for fname in files:
		if '.' in fname:
			# Get files which the package is at
			if os.path.splitext(fname)[1] == prefix[0]:
				# Check if this file matches
				if fname not