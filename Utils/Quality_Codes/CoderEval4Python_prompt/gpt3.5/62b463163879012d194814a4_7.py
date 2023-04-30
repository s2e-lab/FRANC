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
	from collections import defaultdict
	
	with zipfile.ZipFile(zip_path) as z:
	    # dictionary to store package data
	    package_data = defaultdict(list)
	    
	    # loop through all files in the zip
	    for file_name in z.namelist():
	        
	        # only process XML files
	        if file_name.endswith('.xml'):
	            
	            # extract XML file
	            contents = z.read(file_name)
	            
	            # get the XML basename
	            basename = file_name.split('/')[-1].split('.')[0]
	            
	            # add the data to the package data
	            package_data[basename].append(contents)
	            
	return dict(package_data)