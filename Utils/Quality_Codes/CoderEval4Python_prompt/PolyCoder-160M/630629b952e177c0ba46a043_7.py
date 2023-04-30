def get_nodeinfo_well_known_document(url, document_path=None):
	"""
	Generate a NodeInfo .well-known document.
	
	See spec: http://nodeinfo.diaspora.software
	
	:arg url: The full base url with protocol, ie https://example.com
	:arg document_path: Custom NodeInfo document path if supplied (optional)
	:returns: dict
	"""
	import base64  # NOQA: unused
	from django_onion import get_doc_type
	from..nodes_helpers import get_doc_types, _add_node_info_info, _get_node_metadata_info
	from.rest_constants import get_node_type
  
	if'mime_types' in get_doc_types(get_doc_type()):
		format_url = '{}_{}'.format(get_node_type(), get_doc_types()[get_doc_type()]['_urls'])
		return