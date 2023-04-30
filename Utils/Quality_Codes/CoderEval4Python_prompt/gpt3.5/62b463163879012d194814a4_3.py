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
	
	# Check if the zip file exists
	if not os.path.exists(zip_path):
	    raise FileNotFoundError(f"{zip_path} does not exist.")
	
	# Create a dictionary to store data
	data_dict = {}
	
	# Open the zip file and loop over the files
	with zipfile.ZipFile(zip_path) as z:
	    for file_name in z.namelist():
	        # Check if the file is an XML file
	        if file_name.endswith(".xml"):
	            # Get the XML file's basename
	            xml_basename = os.path.splitext(os.path.basename(file_name))[0]
	            # Add the file data to the dictionary
	            if xml_basename in data_dict:
	                data_dict[xml_basename].append(z.read(file_name))
	            else:
	                data_dict[xml_basename] = [z.read(file_name)]
	
	return data_dict