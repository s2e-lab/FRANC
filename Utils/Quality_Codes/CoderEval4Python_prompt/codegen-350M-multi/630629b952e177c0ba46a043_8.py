def get_nodeinfo_well_known_document(url, document_path=None):
	"""
	Generate a NodeInfo .well-known document.
	
	See spec: http://nodeinfo.diaspora.software
	
	:arg url: The full base url with protocol, ie https://example.com
	:arg document_path: Custom NodeInfo document path if supplied (optional)
	:returns: dict
	"""
	
	req = urlopen(url)

	doc = {}
	for line in req.readlines():
		line = line.strip().replace('\n',' ').replace('\r','')

		if line == '':
			continue 
		
		if line[0] == '#':
			continue
		
		fields = line.split()
		keys = fields[2].strip()
		
		# TODO: This will be changed to something like:
		fields.pop(0)
		fields.pop(0)
		
