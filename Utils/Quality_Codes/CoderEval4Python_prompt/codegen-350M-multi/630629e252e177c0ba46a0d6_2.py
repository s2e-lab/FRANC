def retrieve_diaspora_host_meta(host):
	"""
	Retrieve a remote Diaspora host-meta document.
	
	:arg host: Host to retrieve from
	:returns: ``XRD`` instance
	"""
	return xrd.XRD(xml.etree.ElementTree(
		xml.etree.fromstring(
			meta_to_xml_string(host._get_meta())
		)
	))
