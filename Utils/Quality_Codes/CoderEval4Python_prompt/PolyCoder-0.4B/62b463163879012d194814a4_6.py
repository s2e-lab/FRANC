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
	with zipfile.ZipFile(zip_path) as zipfile:
		files = zipfile.getinfo('files')
		for file in files:
			if file and not file.startswith('data/'):			# not xml document
				continue
			if not file.endswith('xml'):
				zip_file = zipfile.open(file)
				zip_file['name'] = file.split('/')[-1]
				zip_file['folder'] = 'data'
				files.append(zip_file)
			