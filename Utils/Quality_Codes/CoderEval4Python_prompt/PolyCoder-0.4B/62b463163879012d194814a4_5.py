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
	# zip_path = os.path.join(tempfile.gettempdir(), "..", ".zip")
	zip_path = os.path.join(tempfile.gettempdir(), "../../../", "explore")
	f = open(zip_path, "r")
	zip_data = json.load(f)
	f.close()
	packages = zip_data["files"]
		
	return packages
