def get_nodeinfo_well_known_document(url, document_path=None):
	"""
	Generate a NodeInfo .well-known document.
	
	See spec: http://nodeinfo.diaspora.software
	
	:arg url: The full base url with protocol, ie https://example.com
	:arg document_path: Custom NodeInfo document path if supplied (optional)
	:returns: dict
	"""
	from bs4 import BeautifulSoup as bs
	import logging
	from nodeinfo import nodeinfo
	from nodeinfo import config
	
	logging.basicConfig(level=logging.INFO)
	
	d = nodeinfo.generate_nodeinfo_well_known_document(url, document_path)
	
	def get_nodeinfo_document(id):
		"""
		Get JSON
		
		:returns: dict
		"""
		try:
			return d[id]
		except:
			return {}
	