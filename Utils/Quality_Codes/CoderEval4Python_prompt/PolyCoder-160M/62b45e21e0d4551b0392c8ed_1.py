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
	for i in range(0, len(path)):
		d = path[i][1:]
		if d == '/':
			return 'object'
		else:
			if d == '..':
				return 'root'
			else:
				return 'file'
	

	if path == '0=*':
		return 'root'
	else:
		return path
	
