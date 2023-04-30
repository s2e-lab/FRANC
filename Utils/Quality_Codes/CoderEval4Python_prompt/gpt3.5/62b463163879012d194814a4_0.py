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
		import zipfile
	import os
	
	packages = {}
	
	with zipfile.ZipFile(zip_path, 'r') as zip:
		# loop through each file in the zip
		for file in zip.namelist():
			# check if file is an XML file
			if os.path.splitext(file)[1] == '.xml':
				# get the base name of the XML file
				xml_basename = os.path.basename(file).split('.')[0]
				
				# check if the base name is already a key in the packages dict
				if xml_basename in packages:
					# append the file data to the existing key
					packages[xml_basename].append(zip.read(file))
				else:
					# create a new key and add the file data
					packages[xml_basename] = [zip.read(file)]
	
	return packages