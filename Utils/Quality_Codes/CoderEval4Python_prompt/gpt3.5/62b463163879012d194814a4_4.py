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
		import os
	import zipfile
	from collections import defaultdict
	
	packages_data = defaultdict(list)
	
	with zipfile.ZipFile(zip_path, 'r') as zip_file:
	    for file in zip_file.namelist():
	        if file.endswith('.xml'):
	            xml_basename = os.path.basename(file).split('.')[0]
	            xml_data = zip_file.read(file).decode('utf-8')
	            packages_data[xml_basename].append(xml_data)
	
	return dict(packages_data)