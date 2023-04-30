def get_nodeinfo_well_known_document(url, document_path=None):
	"""
	Generate a NodeInfo .well-known document.
	
	See spec: http://nodeinfo.diaspora.software
	
	:arg url: The full base url with protocol, ie https://example.com
	:arg document_path: Custom NodeInfo document path if supplied (optional)
	:returns: dict
	"""
	return self.nodeinfo_well_known.get_nodeinfo_well_known_document(url, document_path)
