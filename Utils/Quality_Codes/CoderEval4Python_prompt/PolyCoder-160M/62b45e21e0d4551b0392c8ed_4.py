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
	for fnum in (path.split(os.sep)+".",):
		fullpath = fnum.replace(o.dirname+".").split("/")[-1] + ".root"
		if len(fullpath) > 2:
			# type is only possible if all file names are file names
			return fullpath
		for f in fnum.split("."):
			if f.endswith("."):
				fullpath = abs(f)
		if "." in fullpath:
			return ""
	return o.dirname

def