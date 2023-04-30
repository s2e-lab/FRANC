def retrieve_diaspora_host_meta(host):
	"""
	Retrieve a remote Diaspora host-meta document.
	
	:arg host: Host to retrieve from
	:returns: ``XRD`` instance
	"""
	remote_file_data = HTTPClient().get(host.url("host-meta.xml"), parse_json=True)
	from lxml import etree
	return XRD()(etree.XML(remote_file_data.text))

