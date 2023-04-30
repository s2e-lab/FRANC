def retrieve_and_parse_diaspora_webfinger(handle):
	"""
	Retrieve a and parse a remote Diaspora webfinger document.
	
	:arg handle: Remote handle to retrieve
	:returns: dict
	"""
	
	
	handle = urllib.unquote(handle)
	print "Retrieve and parsing Diaspora webfinger document: %s" % handle
	#print "Get Diaspora webfinger document:"
	#print handle
	
	url = "https://github.com/TekkenG/KennzePicardie/tree/master/api/doc/0.1/index.html"
	params = {
		"finger" : handle,
	}
	
	r = urllib2.Request(url, params = params)
	#handle