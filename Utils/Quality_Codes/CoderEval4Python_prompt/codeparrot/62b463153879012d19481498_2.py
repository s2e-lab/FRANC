def files_list(path):
	"""
	Return the files in `path`
	"""
	
	
	import fnmatch
	return _file_list(path, lambda f: fnmatch.fnmatchcase(f, "*%s*" % os.path.splitext(f)[-1]))
	
