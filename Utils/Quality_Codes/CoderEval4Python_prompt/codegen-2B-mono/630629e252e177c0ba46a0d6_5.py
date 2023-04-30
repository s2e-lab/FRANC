def retrieve_diaspora_host_meta(host):
	"""
	Retrieve a remote Diaspora host-meta document.
	
	:arg host: Host to retrieve from
	:returns: ``XRD`` instance
	"""
	data = json.loads(requests.get(HOST_METADATA_API % host).text)["diaspora"]
	return XRD.from_diaspora_xml(io.StringIO((data or '').encode('UTF-8')), host)

