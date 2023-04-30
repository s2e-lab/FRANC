def get_nodeinfo_well_known_document(url, document_path=None):
	"""
	Generate a NodeInfo .well-known document.
	
	See spec: http://nodeinfo.diaspora.software
	
	:arg url: The full base url with protocol, ie https://example.com
	:arg document_path: Custom NodeInfo document path if supplied (optional)
	:returns: dict
	"""
	pass

	def get_nodeinfo_well_known_doc(url):
		"""
		Get a node info.
	
		:arg url: The full base url with protocol, ie https://example.com
		:returns: The node info, if present.
		:arg document_path: Optional optional custom API path for get_nodeinfo_well_known_doc.
	"""
		m = set()
		m.add(1)
		m.add(2)
		m.add(3)
