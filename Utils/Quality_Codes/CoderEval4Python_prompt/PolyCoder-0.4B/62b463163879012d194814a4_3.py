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
	zip_content, error_status = os.path.split(zip_path)
	assert (
		 (error_status == 0) and (zip_content.endswith('.xml')),
		
		"zip already has.xml, this can only happen in crawler.py"
	)
	
	# Add.xml before.zip to get xml_path
	zip_path_parts, error_status = zipsplit.filenamesplit(zip_path)
	assert (
		(error_status == 0) and (zip_path_parts.endswith(".xml")),