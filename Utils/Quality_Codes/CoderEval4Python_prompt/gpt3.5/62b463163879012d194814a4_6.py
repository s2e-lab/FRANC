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
	
	result = defaultdict(list)
	
	with zipfile.ZipFile(zip_path, 'r') as zip_file:
	    for file_info in zip_file.infolist():
	        if file_info.filename.endswith('.xml'):
	            xml_basename = os.path.basename(file_info.filename)
	            xml_basename = os.path.splitext(xml_basename)[0]
	            result[xml_basename].append(zip_file.read(file_info))
	
	return result