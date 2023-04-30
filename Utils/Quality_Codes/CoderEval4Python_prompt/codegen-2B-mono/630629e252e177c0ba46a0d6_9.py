def retrieve_diaspora_host_meta(host):
	"""
	Retrieve a remote Diaspora host-meta document.
	
	:arg host: Host to retrieve from
	:returns: ``XRD`` instance
	"""
	data = requests.get("https://{}/{}".format(host, DIASPORA_XRD_NAME), allow_redirects=False).text
	return xrd_parse(data, host=host)
	
