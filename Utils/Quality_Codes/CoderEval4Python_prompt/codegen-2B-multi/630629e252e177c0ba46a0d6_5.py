def retrieve_diaspora_host_meta(host):
	"""
	Retrieve a remote Diaspora host-meta document.
	
	:arg host: Host to retrieve from
	:returns: ``XRD`` instance
	"""
	host_meta_url = "%s/host-meta" % host["config"]["uri"]
	return _retrieve(host_meta_url)

