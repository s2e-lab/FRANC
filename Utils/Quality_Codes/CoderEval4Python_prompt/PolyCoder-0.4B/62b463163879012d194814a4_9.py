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
	# print 'ZIP FILE'
	f = open(zip_path,'r')
	df = dict()
	try:
		# Get list of items from central directory
		items = list(set(line.splitlines()))
		# Print info from central directory into list
		df['Info'] = items
	finally:
		# Delete all files in central directory
		for item in df.keys():
			try:
				del set(zip_path + item + '/info.xml') # Remove central directory
			except: