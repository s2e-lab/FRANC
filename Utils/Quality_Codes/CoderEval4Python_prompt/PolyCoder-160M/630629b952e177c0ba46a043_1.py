def get_nodeinfo_well_known_document(url, document_path=None):
	"""
	Generate a NodeInfo .well-known document.
	
	See spec: http://nodeinfo.diaspora.software
	
	:arg url: The full base url with protocol, ie https://example.com
	:arg document_path: Custom NodeInfo document path if supplied (optional)
	:returns: dict
	"""
	return self.get_well_known_document(
		url,
		document_path
	)

	def get_well_known_document(self, url, path=None):
		"""
		Generate a 'well-known document' URL if provided.
	
		 :arg url: The full base url with protocol
		 :arg path: Custom NodeInfo.well-known document path (optional)
		"""
		
		if path is None:
			path = self.get_api_path(url)
	
		info