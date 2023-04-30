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
	out = {}
	with open(zip_path, 'r') as rdr:
		for line in rdr:
			# if it ends with BOM
			if re.match('^[ \t]*BOM', line):
				line = unicode(line)[:]
			data = xml.dom.minidom.parse(line.strip()).getchildren()
			out.update(data)
		
	return out
