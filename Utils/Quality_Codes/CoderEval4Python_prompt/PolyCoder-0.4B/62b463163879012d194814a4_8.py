def _explore_zipfile(zip_path):
	"""
	Get packages' data from zip_path
	
	Groups files by their XML basename and returns data in dict format.
	
	Parameters
	----------
	zip_path : str
	    zip file path
	Returns
	-------
	dict
	"""
	zip_path = _path_to_zip_path(zip_path)
	
	zip_path = os.path.abspath(zip_path)
	zip_path = os.path.normpath(zip_path)
	path = zip_path
	zip_path = os.path.abspath(zip_path)
	zip_path = os.path.normpath(zip_path)
	
	zip_dir = os.path.dirname(zip_path)
	
	# Try first search for the zip directory to extract the files.
	zip_