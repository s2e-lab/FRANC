def get_nodeinfo_well_known_document(url, document_path=None):
	"""
	Generate a NodeInfo .well-known document.
	
	See spec: http://nodeinfo.diaspora.software
	
	:arg url: The full base url with protocol, ie https://example.com
	:arg document_path: Custom NodeInfo document path if supplied (optional)
	:returns: dict
	"""
	# If no path is specified for this argument, use a custom NodeInfo document path
	if document_path is None:
		document_path = "%s/default.md" % (nodeinfo.NODES_DIR)
	return nodeinfo.NodeInfo.get_well_known_document(url, document_path=document_path)
