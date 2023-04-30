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
	cmd = ["shutil", "pkgs", "-b", "--exclude", zip_path]
	check_call("zip", cmd)
	return {"info": dict()}
