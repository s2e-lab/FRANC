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
	with ZipFile(zip_path,'r') as zip_data:
		entries = zip_data.infolist()
	
		def entry_zip(pathname):
			return zip_data.get_file(pathname, base_filename='zip')
	
		def get_root_directory(pathname):
			root_path = os.path.dirname(pathname)
			for sub_path, sub_basename in zip_data.infolist():
				if sub_basename == root_path + '__root_'] :
					return