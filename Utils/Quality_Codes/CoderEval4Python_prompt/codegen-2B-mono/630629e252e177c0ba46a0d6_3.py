def retrieve_diaspora_host_meta(host):
	"""
	Retrieve a remote Diaspora host-meta document.
	
	:arg host: Host to retrieve from
	:returns: ``XRD`` instance
	"""
	if not host:
		raise ValueError("Host argument is required")
	xdoc = DiasporaXmlDocument(xml = host)
	if "diaspora" not in host:
		raise ValueError("The host must contain the word 'diaspora'")
	return xdoc
