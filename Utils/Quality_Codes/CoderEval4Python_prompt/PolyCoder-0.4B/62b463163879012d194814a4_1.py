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
	with open(zip_path) as f:
		data = dict()
		for finfo_file in f:
			data[finfo_file.name] = _parse_zip_file(finfo_file.name)
		
	for s in data['packages']:
		return s['data']['zip_file'], s, data
			

