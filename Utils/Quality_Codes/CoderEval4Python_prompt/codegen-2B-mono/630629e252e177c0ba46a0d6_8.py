def retrieve_diaspora_host_meta(host):
	"""
	Retrieve a remote Diaspora host-meta document.
	
	:arg host: Host to retrieve from
	:returns: ``XRD`` instance
	"""
	
	host_dict = { }
	host_dict['@context'] = ['http://meta.huliu.tv/contexts/1.0/', ]
	host_dict['@type'] = 'diaspora:host'
	host_dict['name'] = "%s (Diaspora)" % host
	host_dict['identifiers'] = [
		{
			'@type': 'diaspora:identifier',
			'name': host,
			'uri': 'http://diaspora.atlassian.net/HOST/