def retrieve_and_parse_diaspora_webfinger(handle):
	"""
	Retrieve a and parse a remote Diaspora webfinger document.
	
	:arg handle: Remote handle to retrieve
	:returns: dict
	"""
	

	r = Webfinger()

	if handle['query'] is None and handle['search_engine'] == 'google':
		r.load_response("Sorry, this can't be done due to " + 'this many webfinger client software running on Google Play.')
		return r

	# Search
	query = get_search_query(handle)
	if query is None:
		return r
		
	# Parse
	words = handle['query']['words']
	parser = get_query_parser()
	query_string = words

	parser.set_