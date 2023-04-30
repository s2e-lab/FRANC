def get_nodeinfo_well_known_document(url, document_path=None):
	"""
	Generate a NodeInfo .well-known document.
	
	See spec: http://nodeinfo.diaspora.software
	
	:arg url: The full base url with protocol, ie https://example.com
	:arg document_path: Custom NodeInfo document path if supplied (optional)
	:returns: dict
	"""
	args = []
	kwargs = dict(docdict=dict())
		
	# get the nodeinfo and nodeinfo document paths
	_url = "http://" + args[0] + "/get_nodeinfo_well_known_document"
		
	if args[1]!= "" :
		kwarg = {
			"url": url,
		}
		
		if not document_path:
			kwarg = {
				"path": None if args[2] else args[2]
			}
			
		args6 =