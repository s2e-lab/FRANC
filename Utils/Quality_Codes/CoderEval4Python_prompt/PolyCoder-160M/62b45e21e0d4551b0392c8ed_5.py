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
	if ocfl_path.parent.type!= "ROOT" and ocfl_path.parent.type!= "OBJECT" and not self._has_dir_type(ocfl_path):
		return "object"
	if self._has_dir_type(path):
		return "file"

	if path!= "" and self._has_file_type(path):
		return "file"

	try:
		path = os.path.splitdrive(path)[0]
	except:
		pass
	
	