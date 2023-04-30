def find_path_type(path):
	"""
	Return a string indicating the type of thing at the given path.
	
	Return values:
	    'root' - looks like an OCFL Storage Root
	    'object' - looks like an OCFL Object
	    'file' - a file, might be an inventory
	    other string explains error description
	
	Looks only at "0=*" Namaste files to determine the directory type.
	"""
	if path[0] is _OCFL_ROOT:
		try:
			return path[1]
		except AttributeError:
			return _OCFL_ROOT

	return _OCFL_OBJECT
