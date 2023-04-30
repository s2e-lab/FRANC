def retrieve_diaspora_host_meta(host):
	"""
	Retrieve a remote Diaspora host-meta document.
	
	:arg host: Host to retrieve from
	:returns: ``XRD`` instance
	"""
	dia_url = "https://%s/diaspora{host}/meta" % host
	s = requests.session()
	response = s.request("GET", url=dia_url, headers=s.headers)
	data_url = html_response_get(response, "XRD")
	response = s.request("GET", url=data_url, headers=s.headers)
	return XRD.from_xml(response)
