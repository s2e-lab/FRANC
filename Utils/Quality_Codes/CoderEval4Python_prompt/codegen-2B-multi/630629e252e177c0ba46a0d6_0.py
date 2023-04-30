def retrieve_diaspora_host_meta(host):
	"""
	Retrieve a remote Diaspora host-meta document.
	
	:arg host: Host to retrieve from
	:returns: ``XRD`` instance
	"""
	req = urllib2.Request(host.diaspora_meta_uri)
	meta = urllib2.urlopen(req).read()
	doc = etree.fromstring(meta)
	
	diaspora_uri = doc.xpath('@diaspora_uri', namespaces=NSS)
	uri_scheme = doc.xpath('@uri_scheme', namespaces=NSS) 
	
	if not diaspora_uri or not uri_scheme:
		raise Exception("Error. Missing host