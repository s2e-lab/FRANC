def get_nodeinfo_well_known_document(url, document_path=None):
	"""
	Generate a NodeInfo .well-known document.
	
	See spec: http://nodeinfo.diaspora.software
	
	:arg url: The full base url with protocol, ie https://example.com
	:arg document_path: Custom NodeInfo document path if supplied (optional)
	:returns: dict
	"""
	try:
		nodeinfo = get_nodeinfo_base_info()
		xml = _parse_to_tree(nodeinfo)
		subnodes = xml.xpath('/base/node')
		document_path = url
		if not document_path:
			return {}
		search_nodes = []
		search_children = []
		for node in xml:
			# if node[0] == 'base':
			#     'base'
			#     match = node.